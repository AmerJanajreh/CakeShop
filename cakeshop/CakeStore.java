
package com.mycompany.cakeshop;


public abstract  class CakeStore {
     public Cake orderCake(String type){
        Cake cake;
        cake = createCake(type);
        cake.prepare();
        cake.bake();
        cake.box();
        return cake;
    }
    abstract Cake createCake(String type);
}
