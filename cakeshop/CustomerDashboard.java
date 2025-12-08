
package com.mycompany.cakeshop;

public class CustomerDashboard implements Observer , Display {
    private static int numberOrder;
    private String nameOrder;
    private static int amount ;
    private String cakeType ;
    private Subject orderData;
    private String city;
    public CustomerDashboard(Subject orderData)  {
        this.orderData = orderData;
        orderData.registerObserver(this);
    }
    @Override
    public void update(String typeCake,String city ,int amount, String nameOrder, int numberOrder) {
       this.city = city;
       this.cakeType =  typeCake ;   
       this.amount =  amount;
       this.nameOrder =  nameOrder ;
       this.numberOrder =  numberOrder ;
    }

    @Override
    public void display() {
        System.out.println( nameOrder + " " + numberOrder);
    }
    
}
