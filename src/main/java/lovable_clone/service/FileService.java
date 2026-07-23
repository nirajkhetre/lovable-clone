package lovable_clone.service;

import lovable_clone.dto.project.FileContentResponse;
import lovable_clone.dto.project.FileNode;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long userId, Long projectId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
