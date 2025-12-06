
package com.mycompany.cakeshop;
public class NablusCheeseCake extends Cake{
    
        public NablusCheeseCake(){
        name = "Nablus Style CheesePizza";
        super.description = name;
        flour = "Whole Wheat flour";
        eggs = "2 yolk, 3 egg whites";
        flavor = "Shaabi Cheese flour";
        sauce = "Cherry sauce";
        toppings.add("Cherry pieces");
    }

    @Override
    public double cost() {
        return 45.0;
    }
}
