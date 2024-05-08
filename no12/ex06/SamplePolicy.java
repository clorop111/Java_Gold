package ex06;

import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Policy;
import java.security.ProtectionDomain;

public class SamplePolicy extends Policy{
    private final PermissionCollection permissions;

    public SamplePolicy(PermissionCollection permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean implies( ProtectionDomain domain,
                            Permission permission) {
            return permissions.implies(permission);
    }
}
