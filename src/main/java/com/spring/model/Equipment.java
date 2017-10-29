package com.spring.model;

import java.awt.Image;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity 
@Table(name="Equipment")
public class Equipment {
	@Id
	@GeneratedValue
	@Column(name="equipmentId")
	private Integer equipmentId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="picture")
	private Image picture;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@ManyToMany(mappedBy="equipment")
	private Set<Exercise> exercises;
	
	/* Start of getters & setters */
	public Integer getEquipmentId() {
		return equipmentId;
	}
	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Image getPicture() {
		return picture;
	}
	public void setPicture(Image picture) {
		this.picture = picture;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Set<Exercise> getExercises() {
		return exercises;
	}
	public void setExercises(Set<Exercise> exercises) {
		this.exercises = exercises;
	}
	/* End of getters & setters */
}
