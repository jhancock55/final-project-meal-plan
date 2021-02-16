package com.john5.menuPlan.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Ingredient {

	private Long id;
	private String ingredientName;
	
	@JsonIgnore
	private RecipeDetail recipeDetail;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getIngredientName() {
		return ingredientName;
	}
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
	
	@ManyToOne
	@JoinColumn(name = "recipeDetailId")
	public RecipeDetail getRecipeDetail() {
		return recipeDetail;
	}
	public void setRecipeDetail(RecipeDetail recipeDetail) {
		this.recipeDetail = recipeDetail;
	}
}
