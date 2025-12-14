
package com.mycompany.cakeshop;

public class CakeOrderingSystem {
   
    private static CakeOrderingSystem system;
  
    private CakeOrderingSystem(){}
    
    public static synchronized CakeOrderingSystem getInstance() {
        if (system == null) {
            system = new CakeOrderingSystem();
        }
        return system;
    }

    public void placeOrder(String city ,  String cakeType  , int chocolateChips , int cream , int Skittles){
        CakeStore store = null;
        OrderData orderData  = new OrderData();
        ManagerDashboard manager = new ManagerDashboard(orderData);
        CustomerDashboard customer = new CustomerDashboard(orderData);
        if(city.equals("nablus")) {
            store = new NablusCakeStore();
        }else if (city.equals("tulkarm")){
           store = new TulkarmCakeStore();
        }
        System.out.println("<<<<<< Create Cake >>>>>>");
        Cake cake = store.orderCake(cakeType);
        String temp = cake.getName();
        for (int i = 0; i < chocolateChips; i++) {
            cake = new ChocolateChips(cake);
        }
        for (int i = 0; i < cream; i++) {
            cake = new Cream(cake);
        }
        for (int i = 0; i < Skittles; i++) {
            cake = new Skittles(cake);
        }
        cake.setName(temp);
        
        orderData.setData(cake , city);
        System.out.println("Cost = " +cake.cost());
        System.out.println("<<<<<< Manager Dashboard >>>>>>");
        manager.display();
        System.out.println("<<<<<< Customer Dashboard >>>>>>");
        customer.display();
        System.out.println("------------------------------------------------------------------------");
    }   
}