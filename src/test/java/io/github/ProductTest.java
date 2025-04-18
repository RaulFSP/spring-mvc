package io.github;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.github.model.Product;
import io.github.repository.ProductRepository;

@SpringBootTest
public class ProductTest {

	@Autowired
	private ProductRepository productRepository;
	
	@Test
	public void testCreate() {
		Product p = new Product("tesoura","instrumentos",10.0);
		productRepository.save(p);
	}
	@Test
	public void testUpdate() {
		var opt = productRepository.findByName("tesoura");
		if (opt.isPresent()) {
			var p = opt.get();
			p.setName("mudança");
			productRepository.save(p);
		}
	}
}
