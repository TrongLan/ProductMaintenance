package com.example.ProductMaintenance.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ProductMaintenance.Entity.Product;
import com.example.ProductMaintenance.Repository.ProductRepository;

@Controller
@RequestMapping("/ProductMaintenance")
public class ProductController {
	@Autowired
	private ProductRepository productRepo;
	
	@GetMapping("/displayAllProducts")
	public String getAllProducts(Model mod) {
		List<Product> product_list = productRepo.findAll();
		mod.addAttribute("dssp", product_list);
		return "viewProducts";
	}
	
	@GetMapping("/deleteProduct")
	public String openConfirmDelete(Model mod, @RequestParam(name = "pcode",required = true) String pcode) {
		Product p = productRepo.findProductByCode(pcode);
		mod.addAttribute("product", p);
		return "confirmDelete";
	}
	
	@GetMapping("/comfirmDelete")
	public String afterDelete(Model mod, @RequestParam(name = "pcode",required = true) String pcode, @RequestParam(name = "confirm",required = false) String agree) {
		if(agree.equals("yes")) {
			productRepo.delete(productRepo.findProductByCode(pcode));	
		}
		return "redirect:/displayAllProducts";
	}
	
	@GetMapping("/updateProduct")
	public String openUpdatePage(Model mod, @RequestParam(name = "pcode",required = true) String pcode) {
		Product p = productRepo.findProductByCode(pcode);
		mod.addAttribute("product", p);
		return "updateProduct";
	}
	
	@GetMapping("/addNewProduct")
	public String addNewProduct(Model mod) {
		Product p = new Product();
		mod.addAttribute("product", p);
		return "updateProduct";
	}
	
	@PostMapping("/updateProduct")
	public String afterUpdateProduct(Product p) {
		productRepo.save(p);
		return "";
	}
	
}
