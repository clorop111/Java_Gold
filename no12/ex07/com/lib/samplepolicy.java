package ex07.com.lib;

import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Policy;
import java.security.ProtectionDomain;

public class samplepolicy extends Policy{
    grant {
        permission java.security.AllPermiission;
    }
}
