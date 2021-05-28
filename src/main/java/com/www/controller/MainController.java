package com.www.controller;




import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;






@Controller
@Transactional
@EnableWebMvc
public class MainController {
	
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
    
   
   
    
}
