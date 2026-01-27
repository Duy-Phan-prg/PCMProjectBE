package com.example.project.service.implement;

import com.example.project.service.FileStorageService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;


@Service
public class FileStorageServiceImpl implements FileStorageService {
    @Override
    public String saveImage(MultipartFile file) {
        try {
            // validate
            if (!file.getContentType().startsWith("image/")) {
                throw new RuntimeException("File must be image");
            }

            String UPLOAD_DIR = "uploads/products/";
            Files.createDirectories(Paths.get(UPLOAD_DIR));

            String fileName = UUID.randomUUID() + "_" + file.getOriginalFilename();
            Path filePath = Paths.get(UPLOAD_DIR + fileName);

            Files.write(filePath, file.getBytes());

            return "/uploads/products/" + fileName;
        } catch (Exception e) {
            throw new RuntimeException("Upload image failed");
        }
    }
}

