package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static final String BREAKFAST = "Talia's Tank";
    public static final String LUNCH = "Toni's Toys";
    public static final String DINNER = "Taeelor's Tail";

    public static void main(String[] args) {
        Map<String,String> meals = new HashMap<>();
        meals.put(BREAKFAST, "Talia's Tank");
        meals.put(LUNCH, "Toni's Toys");
        meals.put(DINNER, "Taeelor's Tail");

        System.out.println(meals.get(DINNER));

        String lunch = meals.remove(LUNCH);
        boolean hasLunch = meals.containsKey(LUNCH);
        boolean hasToni = meals.containsKey("Toni's Toys");
        int size = meals.size();
        System.out.println(lunch + " " + hasLunch + " " + hasToni + " " + size);
    }
}
