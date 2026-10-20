package com.ommooley.project.vibeflow.services;

import com.ommooley.project.vibeflow.dto.project.FileContentResponse;
import com.ommooley.project.vibeflow.dto.project.FileNode;

import java.util.List;

public interface FileService {

    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
