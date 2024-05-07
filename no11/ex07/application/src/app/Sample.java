package app;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Sample {
    public static void main(String[] args) {
        Iterator<Hello> hellos = ServiceLoader.load(Hello.class).iterator();
        while(hellos.hasNext()) {
            Hello h = hellos.next();
            System.out.println(h.hello());
        }
    }
}



//      javac -d bin -sourcepath src src\app\Sample.java 
//      javac -d bin -sourcepath src src\app\Hello.java 

//      javac -classpath /Users/furuzonotaiju/java_gold/java/no11/ex07/library/src/lib/ /Users/furuzonotaiju/java_gold/java/no11/ex07/library/src/lib/HelloImple.java
