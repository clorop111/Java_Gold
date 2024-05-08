package com.lib;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lib {
    public void test() throws Exception {
        Files.list(Paths.get("/")).forEach((p) -> {
            System.out.println(p.getFileName());
        });
    }
    
}
