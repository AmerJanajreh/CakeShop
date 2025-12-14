/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cakeshop;

/**
 *
 * @author Mouse Tech
 */
public class ChocolateChips extends CondimentDecorator{

    Cake cake ;
    
    public ChocolateChips(Cake cake) {
        this.cake = cake;
    }
    
    @Override
    public String getDescription() {
        return cake.getDescription() + " + Chocolate Chips"  ;
    }

    @Override
    public double cost() {
        return cake.cost() + 13.0;
    }
    
    
}
