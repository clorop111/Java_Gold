package lib;
import app.Hello;

public class HelloImple implements Hello {
    @Override
    public String hello() {
        return "Hello, SPI";
    }     
}

// javac -d bin -sourcepath src src/lib/HelloImple.java
// jar cvf imlpl.jar bin\META-INF\services\app.Hello bin\lib\HelloImpl.class