package com.sample.client;
import com.sample.lib.Lib;

public class Main {
    public static void main(String[] args) {
        Lib lib = new Lib();
        lib.test();
    }
}

// javac --module-path modules -d classes/client/ src/client/module-info.java src/client/com/sample/client/Main.java
//jar cvf modules/client.jar -C classes/client .