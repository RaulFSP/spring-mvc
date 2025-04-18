package io.github.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import io.github.model.Product;
import io.github.service.ProductService;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ModelAndView getProduct() {
		ModelAndView view = new ModelAndView("product");
		view.addObject("product", new Product());
		view.addObject("products", productService.findAll());
		return view;
	}
	@PostMapping
	public String postProduct(@ModelAttribute("product") Product prod) {
		productService.save(prod);
		return "redirect:/product";
	}
	
	
}
