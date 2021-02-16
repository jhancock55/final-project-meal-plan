package com.john5.menuPlan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.john5.menuPlan.entity.Recipe;
import com.john5.menuPlan.repository.RecipeRepository;

@Service
public class RecipeService {

	@Autowired
	private RecipeRepository repo;
	
	public Iterable<Recipe> getRecipes() {
		return repo.findAll();
	}
	
	public Recipe createRecipe(Recipe recipe) {
		return repo.save(recipe);
	}
	
	public void deleteRecipe(Long recipeId) {
		repo.delete(recipeId);
	}
}
