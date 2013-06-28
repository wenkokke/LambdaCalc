# maven repositories
repositories.remote << 'http://repo1.maven.org/maven2'

# maven dependencies
LOMBOK      = 'org.projectlombok:lombok:jar:0.11.6'
JPARSEC     = 'jparsec:jparsec:jar:2.0.1'
GUAVA       = 'com.google.guava:guava:jar:13.0.1'
COMMONS_CLI = 'commons-cli:commons-cli:jar:1.2'

# project definition
define 'lambdacalc' do
  project.version = '1.0.0'

  eclipse.natures :java
  
  compile.options.source = '1.7'
  compile.options.target = '1.7'
  compile.with LOMBOK,GUAVA,JPARSEC,COMMONS_CLI
  
  package :jar
end
