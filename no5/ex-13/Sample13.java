import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public interface Sample13 {
    public static void main(String[] args) throws Exception {
        System.out.println("> ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        //dirディレクトリは以下のファイルのパス取得
        Path p = Paths.get("dir", name);
        if (Files.exists(p) == false) {
            Files.createDirectories(p);
        }

        System.out.println(Files.getLastModifiedTime(p));
        System.out.println(Files.getPosixFilePermissions(p));

        System.out.println("delete y/n? >");
        if ("y".equals(scan.nextLine())) {
            Files.delete(p);
            System.out.println("delete");
        }
    }
}
