package io.github.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.model.Product;
import io.github.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product save(Product prod) {
		validate(prod);
		return productRepository.save(prod);
	}

	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	private void validate(Product prod) {
		if (prod == null || prod.getName().isEmpty() || prod.getCategory().isEmpty()) {
			throw new IllegalArgumentException("Product has empty fields");
		}
	}
}
