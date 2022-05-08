package com.example.ProductMaintenance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProductMaintenance.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
