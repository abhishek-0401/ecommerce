package com.geekster.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name="tbl_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="address_id")
    private int addressId;
    @Column(name="address_name")
    private String addressName;
    @Column(name="landmark")
    private String landmark;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="zip_code")
    private String zipCode;
    @Column(name="state")
    private String state;
    @JoinColumn(name="user_id")
    @ManyToOne
    private User userId;
}
