
package com.mycompany.cakeshop;
public class TulkarmChocolateCake extends Cake {
        public TulkarmChocolateCake(){
        name = "Tulkarm Style ChocolatePizza";
        super.description = name;
        flour = "Cake Flour";
        eggs = "3 egg whites";
        flavor = "Chocolate";
        sauce = "Chocolate&Coffee sauce";
        toppings.add("Kinder chocolate pieces");
    }

    @Override
    public double cost() {
        return 40.0;
    }
    
}
