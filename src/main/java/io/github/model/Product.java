package io.github.model;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Version
	private Integer version;
	@CreationTimestamp
	@Column(name = "date_created")
	private LocalDate creationDate;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String category;
	private Double price;
	public Product(String name, String category, Double price) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	
}
