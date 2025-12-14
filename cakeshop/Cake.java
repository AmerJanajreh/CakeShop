
package com.mycompany.cakeshop;

import java.util.ArrayList;

public abstract class Cake {
    String name;
    String flour;
    String eggs;
    String flavor;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();
    void prepare(){
        System.out.println("Prepare " + name);
        System.out.println("Combine daugh component(flour,eggs,flavor,milk,suger...)");
        System.out.println("Adding sause...");
        System.out.println("Adding toppings:");
        for(String x : toppings){
            System.out.println(" "+ x);
        }
    }
    void bake(){
        System.out.println("Bake for 30 minits at 180ْc");
    }
    void box(){
        System.out.println("Place Cake in official CakeStore box");
    }

    String description = "Unknown Cake";

     public String getDescription() {
        return description;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     
     public abstract double cost();
}

