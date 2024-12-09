package com.pas.model;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Setter
@Getter
public class Drug {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int drugId;
	private String drugName;
	private String supplierId;
	private String supplierName;
	private float unitPrice;
	private String status;
	private int totalQuantity;
	@OneToMany(mappedBy = "drug", cascade =CascadeType.ALL)
	@JsonIgnoreProperties("drug")
	private List<Stock> stocks;
}