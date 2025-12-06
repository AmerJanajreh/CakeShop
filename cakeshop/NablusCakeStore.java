
package com.mycompany.cakeshop;

public class NablusCakeStore extends CakeStore{
    
    public Cake createCake(String type){
    if(type.equals("apple"))
        return new NablusAppleCake();
    else if(type.equals("chocolate"))
        return new NablusChocolateCake();
    else if(type.equals("cheese"))
        return new NablusCheeseCake();
    return null;
}
}
