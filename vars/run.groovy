def runproject() {
       sh "java -cp target/jb-hello-world-maven-0.1.0.jar src.main.java.hello.HelloWorld"
}
return this
