def lambdagen project, seed, size
  exe = project._(:target,'LambdaGen')
  `#{exe} #{seed} #{size}`.each_line do |expr|
    yield expr.strip
  end
end

def lambdared project, expr
  exe = project._(:target,'LambdaRed')
  exp = `#{exe} "#{expr}"`.
          lines.
          map {|line| line.strip}.
          reject {|line| line.empty? or line.start_with? 'Performed'}.
          join(' ').
          strip
  raise "lambdared: #{exp}" if exp.start_with? 'ERROR'
  exp
end

def mktestcase project, classname, size, seed
  puts "package lambdacalc;"
  puts ""
  puts "import static org.junit.Assert.assertEquals;"
  puts "import lombok.val;"
  puts "import org.junit.Test;"
  puts ""
  puts "public final class #{classname} extends TestLambdaCalc {"
  puts ""
  testno = 0
  lambdagen project, seed, size do |exp|
    # skip short expressions
    next if exp.length <= 3
    # skip reduction faillures
    red = lambdared project, exp rescue next
    puts "  @Test"
    puts "  public final void test#{testno}() {"
    puts "    reducesTo("
    puts "      \"#{exp.gsub(/\\/,'\\\\\\\\')}\","
    puts "      \"#{red.gsub(/\\/,'\\\\\\\\')}\""
    puts "    );"
    puts "  }"
    puts ""
    testno += 1
  end
  puts "  private final void reducesTo(final String str1, final String str2) {"
  puts "    val exp1 = stl.toDeBruijn(stl.parseUntypedExpr(str1));"
  puts "    val exp2 = stl.toDeBruijn(stl.parseUntypedExpr(str2));"
  puts "    val red1 = stl.format(stl.fromDeBruijn(stl.betaReduce(exp1)));"
  puts "    val red2 = stl.format(stl.fromDeBruijn(exp2));"
  puts "    assertEquals(red2,red1);"
  puts "  }"
  puts ""
  puts "}"
end
