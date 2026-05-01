package main.java.oop.model;


import main.java.oop.model.Meal;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Meal> meals = new ArrayList<>();

    public Order(List<Meal> meals) {
        this.meals = meals;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public void addMeal(Meal meal) {

        this.meals.add(meal);
    }

    public double calculateOrderTotalAmount() {

        double total = 0;

        for(Meal meal : meals) {

            total = total + meal.getPrice();
        }

        return total;
    }
}
