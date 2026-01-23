package com.example.project.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateProductRequest {
    @NotBlank(message = "Product name is required")
    private String productName;

    @Positive(message = "Price must be positive")
    private Double price;

    @Min(value = 0, message = "Stock quantity cannot be negative")
    private Integer stockQuantity;
}
