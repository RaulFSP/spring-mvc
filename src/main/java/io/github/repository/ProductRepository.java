package io.github.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Optional<Product> findByName(String name);
	
}
