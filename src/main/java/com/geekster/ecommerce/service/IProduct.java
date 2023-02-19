package com.geekster.ecommerce.service;

import com.geekster.ecommerce.model.Product;

import java.util.List;

public interface IProduct {
    public List<Product> getProducts(String category);
    public void deleteProduct(int productId);
}
