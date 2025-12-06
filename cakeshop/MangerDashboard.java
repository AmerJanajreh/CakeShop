
package com.mycompany.cakeshop;


public class MangerDashboard implements Observer, Display{
    
    private int numberOrder;
    private String nameOrder;
    private int amount ;
    private String typeCake ;
    private Subject orderData;

    public MangerDashboard(Subject orderData)  {
        this.orderData = orderData;
        orderData.registerObserver(this);
    }
    
    @Override
    public void update(String typeCake, int amount, String nameOrder, int numberOrder) {
       this.typeCake =  typeCake ;   
       this.amount =  amount ;
       this.nameOrder =  nameOrder ;
       this.numberOrder =  numberOrder ;
    }

    @Override
    public void display() {
        System.out.println( typeCake + " Caka " + amount);
    }  
}
