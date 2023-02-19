package com.geekster.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name="tbl_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="product_id")
    private int productId;
    @Column(name="product_name")
    private String productName;
    @Column(name="price")
    private int price;
    @Column(name="description")
    private String description;
    @Column(name="category")
    private String category;
    @Column(name="brand")
    private String brand;
}