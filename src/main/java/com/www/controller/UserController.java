package com.www.controller;

import com.www.entity.NguoiDung;
import com.www.entity.Role;
import com.www.entity.User;
import com.www.form.FormRegister;
import com.www.repository.NguoiDungRepository;
import com.www.repository.RoleRepository;
import com.www.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    @GetMapping("/login")
    public String getLogin() {
        return "user/login";
    }

    @GetMapping("/register")
    public String getRegister() {
        return "user/register";
    }

    @PostMapping(value = "/register", consumes = "application/x-www-form-urlencoded")
    public RedirectView postRegister(FormRegister formRegister, Model model, BindingResult bindingResult, HttpServletRequest request) {
        if (bindingResult.hasErrors()) {
            System.out.println("Co loi xay ra " + bindingResult);

            return new RedirectView(request.getContextPath()+"/user/login");
        } else {
            if (userRepository.findByEmail(formRegister.getEmail()) == null) {
                Role role = roleRepository.findByName("ROLE_MEMBER");

                User user = new User();
                Set<Role> roles = new HashSet<>();
                roles.add(role);
                user.setRoles(roles);
                user.setEmail(formRegister.getEmail());
                user.setPassword(passwordEncoder.encode(formRegister.getMatKhau()));
                userRepository.save(user);

                NguoiDung nguoiDung = new NguoiDung();
                nguoiDung.setUser(user);
                nguoiDung.setHoTenDem(formRegister.getHoTenDem());
                nguoiDung.setTen(formRegister.getTen());
                nguoiDung.setSoDienThoai(formRegister.getSoDienThoai());
                nguoiDungRepository.save(nguoiDung);

                return new RedirectView(request.getContextPath()+"/user/login?success");
            }

            return new RedirectView(request.getContextPath()+"/user/register?failure");
        }

    }

    @RequestMapping(value = {"/information", "/", ""})
    public String getInformation() {
        return "user/information";
    }

    @RequestMapping("/address")
    public String getAddress() {
        return "user/address-page";
    }

}
