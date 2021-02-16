package com.john5.menuPlan.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.john5.menuPlan.entity.Ingredient;
import com.john5.menuPlan.entity.RecipeDetail;
import com.john5.menuPlan.repository.IngredientRepository;
import com.john5.menuPlan.repository.RecipeDetailRepository;
import com.john5.menuPlan.repository.RecipeRepository;

@Service
public class RecipeDetailService {

	@Autowired
	private RecipeDetailRepository repo;
	
	@Autowired
	private RecipeRepository recipeRepo;
	
	@Autowired
	private IngredientRepository ingredientRepo;
	
	private void addIngredientToRecipe(RecipeDetail recipeDetail) {
		Set<Ingredient> ingredients = recipeDetail.getIngredients();
		}
	
	private void add
	
}
