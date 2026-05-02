package main.java.oop.management.cloud;

import main.java.oop.management.abstraction.correct.MenuDataAccessManager;
import main.java.oop.model.Meal;

import java.util.Collections;
import java.util.List;

public class MenuCloudDataAccess implements MenuDataAccessManager {
    private List<Meal> meals = new java.util.ArrayList<>();

    @Override
    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    @Override
    public void removeMeal(String name) {
        meals.removeIf(meal -> meal.getName().equals(name));
    }

    @Override
    public List<Meal> getAllMeals() {
        return meals;
    }

    @Override
    public Meal getMealByName(String mealName) {
        for (Meal meal : meals) {
            if (meal.getName().equals(mealName)) {
                return meal;
            }
        }
        return null;
    }
}
