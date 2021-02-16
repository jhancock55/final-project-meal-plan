package com.john5.menuPlan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.john5.menuPlan.entity.Ingredient;
import com.john5.menuPlan.repository.IngredientRepository;

@Service
public class IngredientService {

	@Autowired
	private IngredientRepository repo;
	
	public Iterable<Ingredient> getIngredients() {
		return repo.findAll();
	}
	
	public Ingredient createIngredient(Ingredient ingredient) {
		return repo.save(ingredient);
	}
	
	public void deleteIngredient(Long ingredientId) {
		repo.delete(ingredientId);
	}
	
}
