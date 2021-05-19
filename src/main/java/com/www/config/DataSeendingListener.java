package com.www.config;

import com.www.dao.NguoiDungDao;
import com.www.dao.RoleDao;
import com.www.dao.UserDao;
import com.www.entity.NguoiDung;
import com.www.entity.Role;
import com.www.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataSeendingListener implements ApplicationListener {

    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private NguoiDungDao nguoiDungDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        /*create user admin and member*/
        if (roleDao.findByName("ROLE_ADMIN") == null) {
            Role role = new Role();
            role.setName("ROLE_ADMIN");
            roleDao.saveRole(role);
        }

        if (roleDao.findByName("ROLE_MEMBER") == null) {
            Role role = new Role();
            role.setName("ROLE_MEMBER");
            roleDao.saveRole(role);
        }

        if (userDao.findByEmail("admin@gamil.com") == null) {
            User user = new User();
            user.setEmail("admin@gamil.com");
            user.setPassword(passwordEncoder.encode("123456"));
            Set<Role> roles = new HashSet<>();
            roles.add(roleDao.findByName("ROLE_ADMIN"));
            roles.add(roleDao.findByName("ROLE_MEMBER"));
            user.setRoles(roles);
            userDao.saveUser(user);

            NguoiDung nguoiDung = new NguoiDung();
            nguoiDung.setHoTenDem("Truong Duc");
            nguoiDung.setTen("Hoan");
            nguoiDung.setSoDienThoai("0349380770");
            nguoiDung.setUser(user);

            nguoiDungDao.saveNguoiDung(nguoiDung);
        }
        if (userDao.findByEmail("member@gamil.com") == null) {
            User user = new User();
            user.setEmail("member@gamil.com");
            user.setPassword(passwordEncoder.encode("123456"));
            Set<Role> roles = new HashSet<>();
            roles.add(roleDao.findByName("ROLE_MEMBER"));
            user.setRoles(roles);
            userDao.saveUser(user);

            NguoiDung nguoiDung = new NguoiDung();
            nguoiDung.setHoTenDem("Truong Duc");
            nguoiDung.setTen("Hoan");
            nguoiDung.setSoDienThoai("0349380770");
            nguoiDung.setUser(user);

            nguoiDungDao.saveNguoiDung(nguoiDung);
        }
    }
}
