package com.thealbert.springcommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ImageDto {
    private Long id;
    private String fileName;
    private String downloadUrl;
}
