package main.java.oop.model;

import main.java.oop.db.DataStore;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    List<Meal> meals = new ArrayList<>();

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meal) {
        this.meals = meal;
    }

    public void addNewMeal(Meal meal) {

        this.meals.add(meal);
    }

    public void removeMeal(String mealName) {

        Meal requiredMeal = null;
        for(Meal meal : meals) {

            if(meal.getName().equals(mealName)) {

                requiredMeal = meal;
            }
        }

        meals.remove(requiredMeal);
    }
}
