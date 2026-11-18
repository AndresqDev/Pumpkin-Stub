package pumpkin;

import java.util.List;

/** Permission definition. */
public class Permission {
    public enum PermissionDefault {
        ALLOW, DENY, OP, NOT_SET
    }

    private final String node;
    private final String description;
    private final PermissionDefault defaultValue;
    private final List<PermissionChild> children;

    public Permission(String node, String description, PermissionDefault defaultValue, List<PermissionChild> children) {
        this.node = node;
        this.description = description;
        this.defaultValue = defaultValue;
        this.children = List.copyOf(children);
    }

    public String getNode() {
        return node;
    }

    public String getDescription() {
        return description;
    }

    public PermissionDefault getDefault() {
        return defaultValue;
    }

    public List<PermissionChild> getChildren() {
        return children;
    }

    public static class PermissionChild {
        public final String node;
        public final boolean value;

        public PermissionChild(String node, boolean value) {
            this.node = node;
            this.value = value;
        }
    }
}
