package lib;

import app.Hello;

public class HelloImpl implements Hello {
    @Override
    public String hello() {
        return "Hello, SPI";
    }     
}

// javac -classpath ./application/src/ library/src/lib/HelloImpl.java
// jar cvf imlpl.jar bin\META-INF\services\app.Hello bin\lib\HelloImpl.class