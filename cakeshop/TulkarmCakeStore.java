
package com.mycompany.cakeshop;

public class TulkarmCakeStore extends CakeStore {
        @Override
        public Cake createCake(String type){
        if(type.equals("apple"))
            return new TulkarmAppleCake();
        else if(type.equals("chocolate"))
            return new TulkarmChocolateCake();
        else if(type.equals("cheese"))
            return new TulkarmCheeseCake();
        return null;
    }
}
