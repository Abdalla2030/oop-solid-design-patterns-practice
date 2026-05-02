package main.java.oop.util;

import main.java.oop.model.Meal;

import java.util.List;

public class ConsoleMenuDisplay implements MenuDisplay {

    @Override
    public void displayMeals(List<Meal> meals) {


        System.out.println("name" + "    " + "description" + "         " + "price");

        for(Meal meal : meals) {

            System.out.println(meal.getName() + "\t" + meal.getDescription() + "\t\t" + meal.getPrice());
        }

    }
}
