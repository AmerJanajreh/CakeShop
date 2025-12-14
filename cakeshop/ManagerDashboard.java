
package com.mycompany.cakeshop;


public class ManagerDashboard implements Observer, Display{
    
    private static int numberOrder;
    private static int amount;
    private Cake cake;
    private Subject orderData;
    private String city;
    
    public ManagerDashboard(Subject orderData)  {
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
        System.out.println( city+" " + cake.getName()  +" "+ amount);
    }  
}
