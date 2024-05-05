package ex13;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) throws Exception {
        System.out.println("> ");
        Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            // Path p = Paths.get("dir", name);
            // try {
            //     Files.deleteIfExists(p)
            // } catch (IOException e) {
            //     throw new RuntimeException()
            // }
            Path p = Paths.get("dir", name);
            if (Files.exists(p) == false) {
                Files.createFile(p);
            }

            //最終更新日時->Files.getLastModifiedTime
            System.out.println(Files.getLastModifiedTime(p));
            //アクセス権限->Files.getPosixFilePermissions
            System.out.println(Files.getPosixFilePermissions(p));

            
            System.out.print("delete y/n? >");
            if("y".equals(scan.nextLine())) {
                Files.delete(p);
                System.out.println("deleted");
            }
    }
}
