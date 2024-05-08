package ex06;

import java.io.FilePermission;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.Permissions;
import java.security.Policy;

public class Sample {
    public static void main(String[] args) throws Exception {
        Permissions permissions = new Permissions();
        permissions.add(new FilePermission("/", "read"));
        Policy.setPolicy(new SamplePolicy(permissions));
        System.setSecurityManager(new SecurityManager());
        Files.list(Paths.get("/")).forEach((p) -> {
            System.out.println(p.getFileName());
        });
    }
}
