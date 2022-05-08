package com.example.ProductMaintenance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ProductMaintenance.Entity.Product;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Long>{
	@Query(value = "SELECT * FROM Product WHERE code = :pcode", nativeQuery = true)
	Product findProductByCode(@Param("pcode") String code);
}
