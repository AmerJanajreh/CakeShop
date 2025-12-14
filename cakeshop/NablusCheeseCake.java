
package com.mycompany.cakeshop;
public class NablusCheeseCake extends Cake{
    
        public NablusCheeseCake(){
        name = "cheese cake";
        super.description = "Nablus Style Cheese Cake";
        flour = "Whole Wheat flour";
        eggs = "2 yolk, 3 egg whites";
        flavor = "Shaabi Cheese flour";
        sauce = "Cherry sauce";
        toppings.add("cheese slices");
    }

    @Override
    public double cost() {
        return 45.0;
    }
}
