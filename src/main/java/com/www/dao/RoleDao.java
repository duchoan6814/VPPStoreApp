package com.www.dao;

import com.www.entity.Role;

import java.util.List;

public interface RoleDao {
    List<Role> findByUserID(int user_id);
    Role findByName(String name);
    boolean saveRole(Role role);
}
