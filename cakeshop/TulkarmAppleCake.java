
package com.mycompany.cakeshop;

public class TulkarmAppleCake extends Cake {
    public TulkarmAppleCake(){
        
        name = "Tulkarm Style Apple Cake";
        super.description = name;
        flour = "whole wheat Flour";
        eggs = "2 yolk , 1 egg whites";
        flavor = "Caramel";
        sauce = "Apple caramel sauce";
        toppings.add("Apple slices");
    }

    @Override
    public double cost() {
        return 40d;
    }
}
