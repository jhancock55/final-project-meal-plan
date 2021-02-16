package com.john5.menuPlan.repository;

import org.springframework.data.repository.CrudRepository;

import com.john5.menuPlan.entity.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
