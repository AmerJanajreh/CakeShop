
package com.mycompany.cakeshop;

public class CakeShop {

    public static void main(String[] args) {
       CakeOrderingSystem system = CakeOrderingSystem.getInstance();
       system.placeOrder("tulkarm", "chocolate"  ,0,1,0);
       system.placeOrder("tulkarm", "chocolate" ,2,1,0);
       system.placeOrder("tulkarm", "chocolate" , 0,2,0);
       system.placeOrder("nablus", "chocolate" , 1,1,0);
       system.placeOrder("tulkarm", "cheese" , 2,1,4);
       system.placeOrder("tulkarm", "apple" , 2,1,1); 
       system.placeOrder("tulkarm", "apple" ,2,1,2);
    }
}
