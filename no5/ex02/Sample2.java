package ex02;

import java.io.File;

public class Sample2 {
    
    public static void main(String[] args) {
        File rootDir = new File(".");
        showTree(rootDir, "");
    }

    private static void showTree(File dir, String indent) {
        File[] files = dir.listFiles();
        for(File file : files) {
            System.out.println(indent + file.getName());
            if (file.isDirectory()) {
                showTree(file , indent + " ");
            }
        }
    }
}
