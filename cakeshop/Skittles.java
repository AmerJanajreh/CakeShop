
package com.mycompany.cakeshop;


public class Skittles extends CondimentDecorator{
    Cake cake ;
    
    public Skittles (Cake cake) {
        this.cake = cake;
    }
    
    @Override
    public String getDescription() {
        return cake.getDescription() + " + Skittles"  ;
    }

    @Override
    public double cost() {
        return cake.cost() + 12d;
    }
}
