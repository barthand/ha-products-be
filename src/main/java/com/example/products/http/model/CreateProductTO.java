package com.example.products.http.model;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record CreateProductTO(
        String manufacturer,
        @NotBlank @Length(max = 100) String substanceName,
        @Length(max = 50) String brandName,
        @Length(max = 1000) String productNumbers) {
}