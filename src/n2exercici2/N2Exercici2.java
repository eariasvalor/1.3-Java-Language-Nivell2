package n2exercici2;

import java.util.*;


public class N2Exercici2 {
    public static void main(String[] args){
        TreeSet<Restaurant> restaurants = new TreeSet<Restaurant>();

        restaurants.add(new Restaurant("Casa Pepe", 2));
        restaurants.add(new Restaurant("Casa Pepe", 4));
        restaurants.add(new Restaurant("Casa Pepe", 3));
        restaurants.add(new Restaurant("Bulli", 5));
        restaurants.add(new Restaurant("Can Roca", 3));
        restaurants.add(new Restaurant("Zhen", 10));
        restaurants.add(new Restaurant("Botafumeiro", 1));


        for(Restaurant r : restaurants) {
            System.out.println(r.toString());
        }


    }
}
