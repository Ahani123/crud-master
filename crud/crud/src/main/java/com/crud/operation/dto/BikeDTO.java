package com.crud.operation.dto;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "showroom")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class BikeDTO implements Serializable{

	private static final long serialVersionUID = 8099995284521357496L;
	@Id
	@Column(name = "ID")
	@GenericGenerator(name = "bike_id", strategy = "increment")
	@GeneratedValue(generator = "bike_id")
	private Long id;
	@Column(name="NAME")
	private String name;
	@Column(name="MODEL")
	private String model;
	@Column(name="PRICE")
	private Long price;
	@Column(name="GEARS")
	private Long gears;
	@Column(name="MILEAGE")
	private Long mileage;
	@Column(name="LIGHTS")
	private String lights;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Long getGears() {
		return gears;
	}
	public void setGears(Long gears) {
		this.gears = gears;
	}
	public Long getMileage() {
		return mileage;
	}
	public void setMileage(Long mileage) {
		this.mileage = mileage;
	}
	public String getLights() {
		return lights;
	}
	public void setLights(String lights) {
		this.lights = lights;
	}
	@Override
	public String toString() {
		return "BikeDTO [id=" + id + ", name=" + name + ", model=" + model + ", price=" + price + ", gears=" + gears
				+ ", mileage=" + mileage + ", lights=" + lights + "]";
	}

	
}
