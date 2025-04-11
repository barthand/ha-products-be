package com.example.products.core;

import com.example.products.core.model.CreateProductCommand;
import com.example.products.core.model.Product;
import com.example.products.core.model.SearchQuery;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final IdGenerator idGenerator;

    public Product createProduct(CreateProductCommand command) {
        final Product product = new Product(
                idGenerator.generateUniqueId(),
                command.manufacturer(),
                command.substanceName(),
                command.brandName(),
                command.productNumbers()
        );
        return productRepository.createProduct(product);
    }

    public List<Product> listProducts() {
        return productRepository.listProducts();
    }

    public List<Product> searchProducts(SearchQuery query) {
        return productRepository.searchProducts(query);
    }
}
