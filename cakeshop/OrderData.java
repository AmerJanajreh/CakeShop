
package com.mycompany.cakeshop;

import java.util.ArrayList;


public class OrderData implements Subject {
    private ArrayList observers;
    private int numberOrder;
    private String nameOrder;
    private int amount ;
    private String typeCake ; 
    
    public OrderData() {
        
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
       observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i  = observers.indexOf(o);
        if (i >= 0 )
        observers.remove(i) ;
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(typeCake , amount ,nameOrder ,numberOrder); 
        } 
    }
    public void DataChanged() {
            notifyObservers();
    }
    public void setData(String typeCake , int amount , String nameOrder , int numberOrder){
       this.typeCake =  typeCake ;   
       this.amount =  amount ;
       this.nameOrder =  nameOrder ;
       this.numberOrder =  numberOrder ;
       DataChanged();
    }
}
