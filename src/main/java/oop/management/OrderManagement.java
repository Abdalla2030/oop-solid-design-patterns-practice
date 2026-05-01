package main.java.oop.management;

import main.java.oop.db.DataStore;
import main.java.oop.model.Order;

public class OrderManagement {

    private DataStore dataStore;

    public OrderManagement(DataStore dataStore) {

        this.dataStore = dataStore;
    }

    public void createOrder(Order order) {

        this.dataStore.getOrders().add(order);
    }

}
