
package com.mycompany.cakeshop;
public class NablusChocolateCake extends Cake {
        public NablusChocolateCake(){
        name = "Nablus Style Chocolate Cake";
        super.description = name;
        flour = "Self-Rising flour";
        eggs = "No eggs";
        flavor = "Chocolate";
        sauce = "White Chocolate sauce";
        toppings.add("Galaxy chocolate pieces");
    }

    @Override
    public double cost() {
        return 35.0;
    }
    
}
