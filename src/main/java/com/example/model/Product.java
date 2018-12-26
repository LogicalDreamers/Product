package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product
{
	@Id
	int sch_id;
	String name;
	public Product(int sch_id, String name) {
		super();
		this.sch_id = sch_id;
		this.name = name;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getSch_id() {
		return sch_id;
	}
	public void setSch_id(int sch_id) {
		this.sch_id = sch_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [sch_id=" + sch_id + ", name=" + name + "]";
	}
}
