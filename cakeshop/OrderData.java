
package com.mycompany.cakeshop;



import java.util.ArrayList;
import java.util.HashMap;


public class OrderData implements Subject {
    private ArrayList observers;
    private static int numberOrder = 0 ;
    private String nameOrder;
    private static HashMap<String , Integer> amount;
    private String cakeType ; 
    private String city;
    static {
        amount = new HashMap();
        amount.put("apple nablus", 0);
        amount.put("apple tulkarm", 0);
        amount.put("cheese nablus", 0);
        amount.put("cheese tulkarm", 0);
        amount.put("chocolate nablus", 0);
        amount.put("chocolate tulkarm", 0); 
    }
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
    public int getAmount(String type , String city){
       amount.put(type + " "+ city, amount.get(type + " " + city) + 1) ; 
       return amount.get(type + " " + city);
    }
    private  int getNumberOrder() {
        numberOrder += 1;
        return numberOrder;
    }
    @Override
    public void notifyObservers() {
        int t1 = getNumberOrder();
        int t2 = getAmount(cakeType , city);
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(cakeType ,city , t2,nameOrder ,t1);
        } 
    }
    public void DataChanged() {
            notifyObservers();
    }
    public void setData(String typeCake, String nameOrder , String city){
       this.city = city;
       this.cakeType =  typeCake ;
       this.nameOrder =  nameOrder ;
       DataChanged();
    }
}
