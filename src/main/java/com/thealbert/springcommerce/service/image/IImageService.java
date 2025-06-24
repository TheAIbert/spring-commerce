package com.thealbert.springcommerce.service.image;

import com.thealbert.springcommerce.dto.ImageDto;
import com.thealbert.springcommerce.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);
    void updateImage(MultipartFile file, Long imageId);
    void deleteImageById(Long id);
}
