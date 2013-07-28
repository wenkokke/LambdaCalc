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
  puts "import org.junit.Test;"
  puts ""
  puts "public final class #{classname} extends ATestBetaReducer {"
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
  puts "}"
end
