package com.john5.menuPlan.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Recipe {
	
	private Long id;
	private String recipeName;
	private String instructions;
	
	@JsonIgnore
	private RecipeDetail recipeDetail;
	
	@JsonIgnore
	private Set<MealPlan> mealPlan;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRecipeName() {
		return recipeName;
	}
	
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	
	public String getInstructions() {
		return instructions;
	}
	
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	@OneToMany(mappedBy="recipe", cascade = CascadeType.ALL)
	public Set<MealPlan> getMealPlan() {
		return mealPlan;
	}
	public void setMealPlan(Set<MealPlan> mealPlan) {
		this.mealPlan = mealPlan;
	}

	@OneToOne(mappedBy = "recipe")
	public RecipeDetail getRecipeDetail() {
		return recipeDetail;
	}

	public void setRecipeDetail(RecipeDetail recipeDetail) {
		this.recipeDetail = recipeDetail;
	}

}
