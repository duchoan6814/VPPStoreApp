package com.www.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.www.entity.SanPham;
import com.www.repository.SanPhamRepository;
import com.www.service.SanPhamService;





@Controller
@Transactional
@EnableWebMvc
public class MainController {


	
	

	// san pham
	@Autowired
	private SanPhamRepository sanPhamRepository;
	

	 @RequestMapping(value="/showFormItemProduct",method = RequestMethod.GET)
	public String getItemProduct(Model model,@RequestParam("sanpham") int theID) {
		SanPham sanpham = sanPhamRepository.findById((long) theID);
		System.out.println("aaa"+sanpham);
		List<SanPham> sanPhams = sanPhamRepository.findByTheLoai(sanpham.getTheLoai());
	
		
		if (sanpham != null) {
			// item sp
			model.addAttribute("sp",sanpham);
//			list sp
			model.addAttribute("sp1", sanPhams);
		}else {
			model.addAttribute("sp", new SanPham());
			model.addAttribute("sp1", sanPhams);
		}
        
		return "item-product";
	}
	
	@GetMapping("/")
	public String spItem(Model model) {
	    model.addAttribute("sanPham", sanPhamRepository.findAll());
	    return "index";
	}
	
	
	
   

    @RequestMapping("/cart")
    public String getCart() {
        return "cart";
    } 
   
    

    
}
