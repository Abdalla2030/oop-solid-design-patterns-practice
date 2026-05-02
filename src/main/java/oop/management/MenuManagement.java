package main.java.oop.management;

import main.java.oop.db.DataStore;
import main.java.oop.management.abstraction.correct.MenuDataAccessManager;
import main.java.oop.model.Meal;

import java.util.List;

public class MenuManagement implements MenuDataAccessManager {

    DataStore dataStore;

    public MenuManagement(DataStore dataStore) {

        this.dataStore = dataStore;
    }

    public void addMeal(Meal meal) {

        dataStore.getMenu().addNewMeal(meal);
    }

    public void removeMeal(String name) {

        dataStore.getMenu().removeMeal(name);
    }

    public Meal getMealByName(String name) {

        Meal selectedMeal = null;

        for(Meal meal : dataStore.getMenu().getMeals()) {

            if(meal.getName().equals(name)) {

                selectedMeal = meal;
            }
        }

        return selectedMeal;
    }

    public List<Meal> getAllMeals() {

        return dataStore.getMenu().getMeals();
    }
}
