# maven repositories
repositories.remote << 'http://repo1.maven.org/maven2'

# maven dependencies
LOMBOK      = 'org.projectlombok:lombok:jar:0.11.6'
JPARSEC     = 'jparsec:jparsec:jar:2.0.1'
GUAVA       = 'com.google.guava:guava:jar:13.0.1'
COMMONS_CLI = 'commons-cli:commons-cli:jar:1.2'

# LambdaCalc project
define 'lambdacalc' do
  project.version = '1.1.0'

  eclipse.natures :java
  
  compile.options.source = '1.7'
  compile.options.target = '1.7'
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