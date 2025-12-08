
package com.mycompany.cakeshop;


public class MangerDashboard implements Observer, Display{
    
    private static int numberOrder;
    private String nameOrder;
    private static int amount ;
    private String typeCake ;
    private Subject orderData;
    private String city;
    
    public MangerDashboard(Subject orderData)  {
        this.orderData = orderData;
        orderData.registerObserver(this);
    }
    
    @Override
    public void update(String typeCake, String city, int amount, String nameOrder, int numberOrder) {
       this.city = city;
       this.typeCake =  typeCake ;   
       this.amount =  amount ;
       this.nameOrder =  nameOrder ;
       this.numberOrder =  numberOrder ;
    }

    @Override
    public void display() {
        System.out.println( typeCake + " Caka " + city +" "+ amount);
    }  
}
