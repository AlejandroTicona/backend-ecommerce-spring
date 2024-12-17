package com.atic.ecommerce.backend.domain.port;

import com.atic.ecommerce.backend.domain.model.Product;

public interface IProductRepository {
    Product save (Product product);
    Iterable<Product> findAll();
    Product findById(Integer id);
    void deleteById(Integer id);
}
