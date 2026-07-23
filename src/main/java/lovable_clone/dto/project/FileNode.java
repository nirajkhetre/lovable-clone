package lovable_clone.dto.project;

public record FileNode(
        String path,
        String modifiedAt,
        Long size,
        String type
) {

}
