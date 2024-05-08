module app {
  exports app;
  uses app.Hello; //appHelloインターフェースをSPIとして使うS
}

// javac --module-path src -d bin/app/ src/module-info.java
// jar cvf module-info.class app/*.class