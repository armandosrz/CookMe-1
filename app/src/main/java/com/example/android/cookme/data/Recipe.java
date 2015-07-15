package com.example.android.cookme.data;

import java.util.LinkedList;

public class Recipe{

	private String name;
	private LinkedList<Ingredient> ingredients;
	private String instructions;

	public Recipe(String name, LinkedList<Ingredient> ingredients, String instructions){
		this.name = name;
		this.ingredients = ingredients;
		this.instructions = instructions;
	}

	//Constructor in case it recieves an array instead of list of ingredients
	public Recipe(String name, Ingredient[] ing, String instructions){
		this.name = name;
		this.instructions = instructions;

		ingredients = new LinkedList<Ingredient>();

		for(int i = 0; i < ing.length; i++){
			ingredients.add(ing[i]);
		}
	}

	public String getName(){
		return name;
	}

	public LinkedList<Ingredient> getIngredients(){
		return ingredients;
	}

	public String getInstructions(){
		return instructions;
	}

	public boolean hasIngredient(String name_ingredient){
		for(Ingredient ing : ingredients){
			if(ing.getName().equals(name_ingredient))
				return true;
		}
		return false;
	}

	public String getStringOfIngredients(){
		String sIngredients = "";
		for(Ingredient ing : ingredients)
			sIngredients += "- " + ing.getName() + " " + ing.getQuantity() + " " + ing.getUnits() + "\n";
		return sIngredients;
	}
}