
package com.mycompany.cakeshop;
public class NablusChocolateCake extends Cake {
        public NablusChocolateCake(){
        name = "chocolate cake";
        super.description = "Nablus Style Chocolate Cake";
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
