package pumpkin;

import java.util.List;

/** Metadata returned by {@link PumpkinPlugin#metadata()}. */
public final class PluginMetadata {
    private final String name;
    private final String version;
    private final List<String> authors;
    private final String description;
    private final List<String> dependencies;
    private final List<String> permissions;

    public PluginMetadata(String name, String version, List<String> authors, String description,
                          List<String> dependencies, List<String> permissions) {
        this.name = name;
        this.version = version;
        this.authors = authors == null ? List.of() : List.copyOf(authors);
        this.description = description;
        this.dependencies = dependencies == null ? List.of() : List.copyOf(dependencies);
        this.permissions = permissions == null ? List.of() : List.copyOf(permissions);
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getDependencies() {
        return dependencies;
    }

    public List<String> getPermissions() {
        return permissions;
    }
}
