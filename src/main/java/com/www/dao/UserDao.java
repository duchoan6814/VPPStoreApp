package com.www.dao;

import com.www.entity.User;

public interface UserDao {
    User findByEmail(String email);
    boolean saveUser(User user);
}
