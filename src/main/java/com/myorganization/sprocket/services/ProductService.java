package com.myorganization.sprocket.services;

import com.myorganization.sprocket.models.entities.Product;
import com.myorganization.sprocket.repositories.ProductRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void delete(final Product product) {
        repository.delete(product);
    }

    /**
     * Find All Products.
     *
     * @return
     */
    public List<Product> findAll() {
        final Sort sort = Sort.by(Sort.Direction.ASC, "productName", "category");
        return repository.findAll(sort);
    }

    public Product findById(final Long productId) {

        return repository.findById(productId).orElse(null);
    }

    public Product save(final Product product) {

        return repository.save(product);
    }
}
