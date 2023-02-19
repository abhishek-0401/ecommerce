package com.geekster.ecommerce.controller;

import com.geekster.ecommerce.model.Order;
import com.geekster.ecommerce.model.Product;
import com.geekster.ecommerce.model.User;
import com.geekster.ecommerce.service.EcoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ecom")
public class EcoController {
    @Autowired
    private EcoService ecoService;

    @GetMapping("/get-order-by-orderid")
    private Order getOrderByOrderId(@RequestParam Integer orderId){
        return ecoService.getOrderByOrderId(orderId);
    }
    @GetMapping("/get-user-by-userid")
    private User getUserByUserId(@RequestParam Integer userId){
        return ecoService.getUserByUserId(userId);
    }
    @GetMapping("/get-products-by-category")
    private List<Product> getProducts(@RequestParam String category){
        return ecoService.getProducts(category);
    }
    @DeleteMapping("/deleteById/productId/{productId}")
    private ResponseEntity<String> deleteProduct(@PathVariable int productId){
        ecoService.deleteProduct(productId);
        return ResponseEntity.ok("The product with product Id: "+productId+", has been deleted successfully");
    }
}
