
package com.mycompany.cakeshop;
public class TulkarmCheeseCake extends Cake{
        public TulkarmCheeseCake(){
        name = "cheese cake";
        super.description = "Tulkarm Style Cheese Cake";
        flour = "SelfRising";
        eggs = "No eggs";
        flavor = "Vanilla-Cheese flavor";
        sauce = "Strawberry sauce";
        toppings.add("cheese slices");
    }

    @Override
    public double cost() {
        return 35.0;
    }
}
