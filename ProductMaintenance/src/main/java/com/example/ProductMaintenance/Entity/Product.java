package com.example.ProductMaintenance.Entity;

import java.text.NumberFormat;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(columnDefinition = "varchar(10)", nullable = false, unique = true)
	private String code;
	@Column(columnDefinition = "varchar(1000)", nullable = false)
	private String description;
	@Column(nullable = false)
	private float price;
	
    public String getPriceCurrencyFormat(){
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return nf.format(this.price);
    }
}
