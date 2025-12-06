
package com.mycompany.cakeshop;


public class Chips extends CondimentDecorator{
    Cake cake ;
    
    public Chips(Cake cake) {
        this.cake = cake;
    }
    
    @Override
    public String getDescription() {
        return cake.getDescription() + " + Chips"  ;
    }

    @Override
    public double cost() {
        return cake.cost() + 5.0;
    }
    
    
}
