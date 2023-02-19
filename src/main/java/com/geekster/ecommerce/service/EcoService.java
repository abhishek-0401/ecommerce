package com.geekster.ecommerce.service;

import com.geekster.ecommerce.model.Order;
import com.geekster.ecommerce.model.Product;
import com.geekster.ecommerce.model.User;
import com.geekster.ecommerce.repository.OrderRepository;
import com.geekster.ecommerce.repository.ProductRepository;
import com.geekster.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EcoService implements IOrder,IUser,IProduct{

    @Autowired
    OrderRepository orderRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ProductRepository productRepository;
    @Override
    public Order getOrderByOrderId(Integer orderId) {
        if(orderRepository.findById(orderId).isPresent())
            return orderRepository.findById(orderId).get();
        else
            return null;
    }
    @Override
    public User getUserByUserId(Integer userId) {
        if(userRepository.findById(userId).isPresent())
            return userRepository.findById(userId).get();
        else
            return null;
    }
    @Override
    public List<Product> getProducts(String category){
        List<Product> newProducts = new ArrayList<>();
        for(Product product:productRepository.findAll()){
            if(product.getCategory().equals(category)){
                newProducts.add(product);
            }
        }
        return newProducts;
    }
    @Override
    public void deleteProduct(int productId) {
        List<Order> orders = orderRepository.findAll();
        Product product;
        for (Order order:orders) {
            product= order.getProductId();
            if(product.getProductId()==productId) {
                orderRepository.delete(order);
            }
        }
        productRepository.deleteById(productId);
    }
}
