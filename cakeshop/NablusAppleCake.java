
package com.mycompany.cakeshop;


public class NablusAppleCake extends Cake{

    public NablusAppleCake(){ 
        name = "apple cake";
        super.description = "Nablus Style Apple Cake";
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
