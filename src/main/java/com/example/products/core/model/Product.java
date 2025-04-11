package com.example.products.core.model;

public record Product(
        String applicationNumber,
        String manufacturer,
        String substanceName,
        String brandName,
        String productNumbers) {
}