package com.www.config;

import com.www.entity.NguoiDung;
import com.www.entity.Role;
import com.www.entity.User;
import com.www.repository.NguoiDungRepository;
import com.www.repository.RoleRepository;
import com.www.repository.UserRepository;
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
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("hello");
        /*create user admin and member*/
        if (roleRepository.findByName("ROLE_ADMIN") == null) {
            Role role = new Role();
            role.setName("ROLE_ADMIN");
            roleRepository.save(role);
        }

        if (roleRepository.findByName("ROLE_MEMBER") == null) {
            Role role = new Role();
            role.setName("ROLE_MEMBER");
            roleRepository.save(role);
        }

        if (userRepository.findByEmail("admin@gamil.com") == null) {
            User user = new User();
            user.setEmail("admin@gamil.com");
            user.setPassword(passwordEncoder.encode("123456"));
            Set<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName("ROLE_ADMIN"));
            roles.add(roleRepository.findByName("ROLE_MEMBER"));
            user.setRoles(roles);
            userRepository.save(user);

            NguoiDung nguoiDung = new NguoiDung();
            nguoiDung.setHoTenDem("Truong Duc");
            nguoiDung.setTen("Hoan");
            nguoiDung.setSoDienThoai("0349380770");
            nguoiDung.setUser(user);

            nguoiDungRepository.save(nguoiDung);
        }
        if (userRepository.findByEmail("member@gamil.com") == null) {
            User user = new User();
            user.setEmail("member@gamil.com");
            user.setPassword(passwordEncoder.encode("123456"));
            Set<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName("ROLE_MEMBER"));
            user.setRoles(roles);
            userRepository.save(user);

            NguoiDung nguoiDung = new NguoiDung();
            nguoiDung.setHoTenDem("Truong Duc");
            nguoiDung.setTen("Hoan");
            nguoiDung.setSoDienThoai("0349380770");
            nguoiDung.setUser(user);

            nguoiDungRepository.save(nguoiDung);
        }
    }
}
