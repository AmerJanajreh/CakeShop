
package com.mycompany.cakeshop;

import java.util.ArrayList;

public class NablusAppleCake extends Cake{

    public NablusAppleCake(){ 
        name = "Nablus Style Apple Cake";
        super.description = name;
        flour = "Cake flour";
        eggs = "1 yolk , 2 egg whites";
        flavor = "Vanilla";
        sauce = "Thousand Apple sauce";
        toppings.add("Fruit pieces");
    }

    @Override
    public double cost() {
        return 40.0;
    }
}
