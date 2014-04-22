# maven repositories
repositories.remote << 'http://repo1.maven.org/maven2'

# maven dependencies
LOMBOK      = 'org.projectlombok:lombok:jar:1.12.6'
JPARSEC     = 'jparsec:jparsec:jar:2.0.1'
GUAVA       = 'com.google.guava:guava:jar:13.0.1'
COMMONS_CLI = 'commons-cli:commons-cli:jar:1.2'

# LambdaCalc project
define 'lambdacalc' do
  project.version = '1.1.4'

  eclipse.natures :java

  compile.options.source = '1.6'
  compile.options.target = '1.6'
  compile.with LOMBOK,GUAVA,JPARSEC,COMMONS_CLI

  package(:jar).with \
    :manifest => manifest.merge('Main-Class' => 'lambdacalc.STL')
end

# LambdaRed executable (requires MosML)
LambdaRedMl = project('lambdacalc')._(:src,:test,:ml,'LambdaRed.sml')
LambdaRed   = project('lambdacalc')._(:target,'LambdaRed.exe')

task :lambdared => LambdaRed
file LambdaRed => LambdaRedMl do
  old = Dir.getwd
  Dir.chdir(File.dirname(LambdaRedMl))
  system "make"
  mv LambdaRedMl.ext('.exe'), LambdaRed
  system "make clean"
  Dir.chdir(old)
end

# LambdaGen executable (requires GHC)
LambdaGenHs = project('lambdacalc')._(:src,:test,:hs,'LambdaGen.hs')
LambdaGen   = project('lambdacalc')._(:target,'LambdaGen.exe')

task :lambdagen => LambdaGen
file LambdaGen => LambdaGenHs do
  system "ghc --make #{LambdaGenHs}"
  mv LambdaGenHs.ext('.exe'), LambdaGen
  rm LambdaGenHs.ext('.hi')
  rm LambdaGenHs.ext('.o')
end

# Generate randomized unit tests
task :mktestcase, [:classname,:size,:seed] => [LambdaRed, LambdaGen] do |t, args|
  args.with_defaults(:seed => rand(999999999), :size => 100)

  # check if classname is provided
  if args.classname.nil?
    exit "usage: mktestcase[classname,size=100,seed=rand]"
  else

    # check if the file exists
    classfile = project('lambdacalc')._(:src,:test,:java,:lambdacalc,"#{args.classname}.java")
    if File.exist? classfile
      puts "file exists: #{classfile}"
    else
      File.open(classfile, "w") do |newout|
        # redirect stdout to the script file
        oldout = $stdout
        $stdout = newout
        begin
          mktestcase project('lambdacalc'), args.classname, args.size, args.seed
        ensure
          # restore the stdout
          $stdout = oldout
        end
      end
    end
  end
end
