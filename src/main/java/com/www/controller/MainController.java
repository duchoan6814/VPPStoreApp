package com.www.controller;



<<<<<<< HEAD
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
=======

>>>>>>> trang chu
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

<<<<<<< HEAD
import com.www.entity.SanPham;
import com.www.repository.SanPhamRepository;
import com.www.service.SanPhamService;
=======



>>>>>>> trang chu


@Controller
@Transactional
@EnableWebMvc
public class MainController {
<<<<<<< HEAD


	@RequestMapping("/cart")
	public String getCart() {
		return "cart";
	} 
	

	// san pham
	@Autowired
	private SanPhamRepository sanPhamRepository;
	

	 @RequestMapping(value="/showFormItemProduct",method = RequestMethod.GET)
	public String getItemProduct(Model model,@RequestParam("sanpham") int theID) {
		SanPham sanpham = sanPhamRepository.findById((long) theID);
		List<SanPham> sanPhams = sanPhamRepository.findByTheLoai(sanpham.getTheLoai());
		
		if (sanpham != null) {
			model.addAttribute("sp",sanpham);
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
	
	
=======
	
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/cart")
    public String getCart() {
        return "cart";
    } 
    @GetMapping("/showFormItemProduct")
    public String getItemProduct() {
        return "item-product";
    }
    
//    @RequestMapping(value = "/showFormAddProduct", method = RequestMethod.GET)
//    public String showForm(Model model) {
//    	model.addAttribute("product", new SanPham());
//        return "admin/themSP";
//    }
//
//    @RequestMapping(value = "/saveSP", method = RequestMethod.POST)
//    public String submit(@Valid @ModelAttribute("sp")SanPham sanPham, 
//      BindingResult result, ModelMap model)  {
//		if(result.hasErrors()) {
//			return "error";
//		}else {
//			if(sanPham.getId()==0)
//			{
//				sanPhamService.addSP(sanPham);
//			}
//			else
//			{ 
//				sanPhamService.updateSp(sanPham);
//			}
//
//			return "admin/listSP";
//		}
//
//	}
    
   
   
    
>>>>>>> trang chu
}
