package n2exercici1;

import java.util.HashSet;

public class N2Exercici1 {
    public static void main (String[] args){
        HashSet<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("Casa Pepe", 3));
        restaurants.add(new Restaurant("Casa Pepe", 4));
        restaurants.add(new Restaurant("Casa Pepe", 3));

        for(Restaurant r : restaurants) {
            System.out.println(r.toString());
        }
    }
}
