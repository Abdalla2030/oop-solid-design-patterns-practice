package main.java.oop.model;

import main.java.oop.db.DataStore;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    List<Meal> meals = new ArrayList<>();

    DataStore dataStore;

    public Menu(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    void addMeal(String name, String description, double price) {

        Meal meal = new Meal(name, description, price);

        dataStore.getMeals().add(meal);
    }

    void removeMeal(String name) {

        for (Meal meal : dataStore.getMeals()) {
            if (meal.getName().equals(name)) {
                dataStore.getMeals().remove(meal);
            }
        }
    }

    Meal getMeal(String name) {

        Meal selectedMeal = null;

        for (Meal meal : dataStore.getMeals()) {
            if (meal.getName().equals(name)) {
                selectedMeal = meal;
            }
        }

        return selectedMeal;
    }

    void getAllMeals() {

        System.out.println("name    description         price");

        for (Meal meal : dataStore.getMeals()) {
            System.out.println(meal.getName() + "\t" + meal.getDescription() + "\t\t" + meal.getPrice());
        }
    }
}
