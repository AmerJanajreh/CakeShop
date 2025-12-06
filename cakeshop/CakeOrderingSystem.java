
package com.mycompany.cakeshop;

import java.util.HashMap;


public class CakeOrderingSystem {

    
    private static CakeOrderingSystem system;
   
    static HashMap<String , Integer> map = new HashMap();
    static int numberOrder ;
    
    private CakeOrderingSystem() {
        map.put("apple nablus", 0);
        map.put("apple tulkarm", 0);
        map.put("cheese nablus", 0);
        map.put("cheese tulkarm", 0);
        map.put("chocolate nablus", 0);
        map.put("chocolate tulkarm", 0);
        numberOrder = 0;
    }
    
    public static synchronized CakeOrderingSystem getInstance() {
        if (system == null) {
            system = new CakeOrderingSystem();
        }
        return system;
    }
    public static int getAmount(String city  , String type){
       map.put(type + " " + city , map.get(type + " " + city) + 1) ; 
       return map.get(type+ " " + city);
    }
    private static int getNumberOrder() {
        numberOrder += 1;
        return numberOrder;
    }
    public void placeOrder(String city ,  String cakeType  ,String nameOrder){
        CakeStore c;
        OrderData orderData  = new OrderData();
        MangerDashboard manager = new MangerDashboard(orderData);
        CustomerDashboard customer = new CustomerDashboard(orderData);
        if(city.equals("nablus")) {
            c = new NablusCakeStore();
            c.createCake(cakeType);
        }else if (city.equals("tulkarm")){
           c = new TulkarmCakeStore();
           c.createCake(cakeType);
        }
        orderData.setData(cakeType, getAmount(city , cakeType), nameOrder, getNumberOrder());
        orderData.DataChanged();
        System.out.println("<<<<<< Manager Dashboard >>>>>>");
        manager.display();
        System.out.println("<<<<<< Customer Dashboard >>>>>>");
        customer.display();
    }   
}
