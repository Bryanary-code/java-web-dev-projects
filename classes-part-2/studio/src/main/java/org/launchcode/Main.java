package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem burger = new MenuItem("Cheeseburger", 11, "Cheeseburger", "sandwiches", false, new Date());
        MenuItem salad = new MenuItem("Salad", 8, "House Salad", "salads", false, new Date());
        MenuItem cheesecake = new MenuItem("Cheesecake", 5, "Cherry topped cheesecake", "dessert", true, new Date());

        ArrayList<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(burger);
        menuItems.add(salad);


        Menu menu = new Menu(menuItems, new Date());

        menu.addItem(cheesecake);
        menu.removeItem(salad);

        menu.printFullMenu();

        menu.printOneItem(burger);

    }
}
