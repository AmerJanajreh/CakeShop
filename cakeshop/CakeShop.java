
package com.mycompany.cakeshop;

public class CakeShop {

    public static void main(String[] args) {
       CakeOrderingSystem system = CakeOrderingSystem.getInstance();
       
       system.placeOrder("tulkarm", "chocolate", "Amer" , 0,2,1,0);
       system.placeOrder("tulkarm", "chocolate", "Amer" , 0,2,1,0);
       system.placeOrder("tulkarm", "chocolate", "Amer" , 0,2,1,0);
       system.placeOrder("nablus", "chocolate", "Anas" , 1,0,1,0);
       system.placeOrder("tulkarm", "cheese", "Amjad" , 2,2,1,4);
       system.placeOrder("tulkarm", "apple", "Wesam" , 1,2,1,1); 
       system.placeOrder("tulkarm", "apple", "Wesam" , 3,2,1,2);

    }
}
