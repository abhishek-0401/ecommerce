package com.geekster.ecommerce.service;

import com.geekster.ecommerce.model.User;

public interface IUser {
    public User getUserByUserId(Integer userId);
}
