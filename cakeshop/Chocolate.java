/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cakeshop;

/**
 *
 * @author Mouse Tech
 */
public class Chocolate extends CondimentDecorator{

    Cake cake ;
    
    public Chocolate(Cake cake) {
        this.cake = cake;
    }
    
    @Override
    public String getDescription() {
        return cake.getDescription() + " + Chocolate"  ;
    }

    @Override
    public double cost() {
        return cake.cost() + 10.0;
    }
    
    
}
