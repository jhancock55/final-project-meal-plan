package com.john5.menuPlan.repository;

import org.springframework.data.repository.CrudRepository;

import com.john5.menuPlan.entity.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {

}
