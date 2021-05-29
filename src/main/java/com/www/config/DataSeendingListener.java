package com.www.config;

import com.www.entity.DiaChi;
import com.www.entity.NguoiDung;
import com.www.entity.Role;
import com.www.entity.User;
import com.www.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
    private TheLoaiRepository theLoaiRepository;
    @Autowired
    private SanPhamRepository sanPhamRepository;

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

        if (userRepository.findByEmail("admin@gmail.com") == null) {
            User user = new User();
            user.setEmail("admin@gmail.com");
            user.setPassword(passwordEncoder.encode("123456"));
            Set<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName("ROLE_ADMIN"));
            roles.add(roleRepository.findByName("ROLE_MEMBER"));
            user.setRoles(roles);
//            userRepository.save(user);

            NguoiDung nguoiDung = new NguoiDung();
            nguoiDung.setHoTenDem("Truong Duc");
            nguoiDung.setTen("Hoan");
            nguoiDung.setSoDienThoai("0349380770");
            nguoiDung.setUser(user);

            nguoiDungRepository.save(nguoiDung);
        }
        if (userRepository.findByEmail("member@gmail.com") == null) {
            User user = new User();
            user.setEmail("member@gmail.com");
            user.setPassword(passwordEncoder.encode("123456"));
            Set<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName("ROLE_MEMBER"));
            user.setRoles(roles);
//            userRepository.save(user);

            Set<DiaChi> diaChis = new HashSet<>();
            DiaChi diaChi = new DiaChi();
            diaChi.setPhuongXa("");
            diaChi.setQuanHuyen("go vap");
            diaChi.setTinhThanhPho("tp.HCM");
            diaChi.setChiTiet("qb6 nguyen thai son");
            diaChi.setTenNguoiNhan("truong duc hoan");
            DiaChi diaChi1 = new DiaChi();
            diaChi1.setPhuongXa("33");
            diaChi1.setQuanHuyen("go vap");
            diaChi1.setTinhThanhPho("tp.HCM");
            diaChi1.setChiTiet("qb6 nguyen thai son");
            diaChi1.setTenNguoiNhan("truong duc hoan");

            diaChis.add(diaChi);
            diaChis.add(diaChi1);

            NguoiDung nguoiDung = new NguoiDung();
            nguoiDung.setHoTenDem("Truong Duc");
            nguoiDung.setTen("Hoan");
            nguoiDung.setSoDienThoai("0349380770");
            nguoiDung.setUser(user);
            nguoiDung.setDiaChis(diaChis);

            nguoiDungRepository.save(nguoiDung);
        }

//        System.out.println("hello world"+sanPhamRepository.findAll());
//        	System.out.println("aaaa"+sanPhamRepository.findById(8));

    }
}
