
package com.mycompany.cakeshop;

import java.util.HashMap;


public class CakeOrderingSystem {

    
    private static CakeOrderingSystem system;
   

    private CakeOrderingSystem() {

    }
    
    public static synchronized CakeOrderingSystem getInstance() {
        if (system == null) {
            system = new CakeOrderingSystem();
        }
        return system;
    }

    public void placeOrder(String city ,  String cakeType  ,String nameOrder ,int chips , int chocolate , int cream , int Skittles){
        CakeStore store = null;
        OrderData orderData  = new OrderData();
        MangerDashboard manager = new MangerDashboard(orderData);
        CustomerDashboard customer = new CustomerDashboard(orderData);
        if(city.equals("nablus")) {
            store = new NablusCakeStore();
        }else if (city.equals("tulkarm")){
           store = new TulkarmCakeStore();
        }

        Cake cake = store.createCake(cakeType);
        for (int i = 0; i < chips; i++) {
            cake = new Chips(cake);
        }
        for (int i = 0; i < chocolate; i++) {
            cake = new Chocolate(cake);
        }
        for (int i = 0; i < cream; i++) {
            cake = new Cream(cake);
        }
        for (int i = 0; i < Skittles; i++) {
            cake = new Skittles(cake);
        }
        System.out.println(cake.getDescription());
        System.out.println("Cost = " +cake.cost());
        System.out.println("<<<<<< Create Cake >>>>>>");
        System.out.println(cake.getDescription());
        System.out.println("Cost = " +cake.cost());
        store.orderCake(cakeType);
        orderData.setData(cakeType, nameOrder , city);
        System.out.println("<<<<<< Manager Dashboard >>>>>>");
        manager.display();
        System.out.println("<<<<<< Customer Dashboard >>>>>>");
        customer.display();
        System.out.println("---------------------------------------------------------");
    }   
}