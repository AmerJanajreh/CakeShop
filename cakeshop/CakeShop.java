
package com.mycompany.cakeshop;

public class CakeShop {

    public static void main(String[] args) {
       CakeOrderingSystem system = CakeOrderingSystem.getInstance();
       system.placeOrder("nablus", "apple", "Amer");
       system.placeOrder("nablus", "apple", "Anas");
    }
}
