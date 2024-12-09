package com.pas.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Stock {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int batchId;
	    private LocalDate manDate;
	    private LocalDate expDate;
	    private int totalQuantity;
	    private int thresholdLevel;
	    @ManyToOne
	    @JoinColumn(name="drugId")
	    @JsonIgnoreProperties("stocks")
	    private Drug drug;
		public int getBatchId() {
			return batchId;
		}
		public void setBatchId(int batchId) {
			this.batchId = batchId;
		}
		public LocalDate getManDate() {
			return manDate;
		}
		public void setManDate(LocalDate manDate) {
			this.manDate = manDate;
		}
		public LocalDate getExpDate() {
			return expDate;
		}
		public void setExpDate(LocalDate expDate) {
			this.expDate = expDate;
		}
		public int getTotalQuantity() {
			return totalQuantity;
		}
		public void setTotalQuantity(int totalQuantity) {
			this.totalQuantity = totalQuantity;
		}
		public int getThresholdLevel() {
			return thresholdLevel;
		}
		public void setThresholdLevel(int thresholdLevel) {
			this.thresholdLevel = thresholdLevel;
		}
		public Drug getDrug() {
			return drug;
		}
		public void setDrug(Drug drug) {
			this.drug = drug;
		}
	   

	    
	}


