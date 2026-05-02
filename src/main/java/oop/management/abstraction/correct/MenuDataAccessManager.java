package main.java.oop.management.abstraction.correct;

import main.java.oop.model.Meal;

import java.util.List;

public interface MenuDataAccessManager {
    void removeMeal(String name);

    void addMeal(Meal meal);

    List<Meal> getAllMeals();

    Meal getMealByName(String mealName);
}
