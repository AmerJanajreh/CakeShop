
package com.mycompany.cakeshop;


public class MangerDashboard implements Observer, Display{
    
    private static int numberOrder;
    private static int amount;
    private Cake cake;
    private Subject orderData;
    private String city;
    
    public MangerDashboard(Subject orderData)  {
        this.orderData = orderData;
        orderData.registerObserver(this);
    }
    
    @Override
    public void update(Cake cake, String city, int amount, int numberOrder) {
       this.city = city;
       this.cake =  cake ;   
       this.amount =  amount ;
       this.numberOrder =  numberOrder ;
        
    }

    @Override
    public void display() {
        System.out.println( city+" " + cake.name + " Cake "  +" "+ amount);
    }  
}
