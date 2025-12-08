/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cakeshop;


public class Cream extends CondimentDecorator{
    
    Cake cake ;
    
    public Cream(Cake cake) {
        this.cake = cake;
    }
    
    @Override
    public String getDescription() {
        return cake.getDescription() + " + Cream"  ;
    }

    @Override
    public double cost() {
        return cake.cost() + 8.0;
    }
}
