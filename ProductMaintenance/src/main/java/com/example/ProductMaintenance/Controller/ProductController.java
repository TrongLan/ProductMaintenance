package com.example.ProductMaintenance.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ProductMaintenance.Entity.Product;
import com.example.ProductMaintenance.Repository.ProductRepository;

@Controller
public class ProductController {
	@Autowired
	private ProductRepository productRepo;
	
	@GetMapping("/displayAllProducts")
	public String getAllProducts(Model mod) {
		List<Product> product_list = productRepo.findAll();
		mod.addAttribute("dssp", product_list);
		return "viewProducts";
	}
}
