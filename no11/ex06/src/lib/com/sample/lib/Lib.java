package com.sample.lib;

public class Lib {
    public void test() {
        System.out.println("test");
    }
}
//  jar cvf modules/lib.jar -C classes/lib .
// javac -d classes/lib/ src/lib/module-info.java src/lib/com/sample/lib/Lib.java
