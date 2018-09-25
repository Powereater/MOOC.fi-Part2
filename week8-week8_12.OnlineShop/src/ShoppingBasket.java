import java.util.Map;
import java.util.HashMap;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
public class ShoppingBasket {
    private Map<String, Purchase> Basket = new HashMap<String, Purchase>();
   
    public void add(String product, int price){
        //Purchase item = new Purchase( product, 1, price)
        if (this.Basket.get(product) != (null)) {
            this.Basket.get(product).increaseAmount();
        }
        else {
            this.Basket.put(product,new Purchase( product, 1, price));
        }
        
    }
    public int price(){
        int total =0;
        for (String i:this.Basket.keySet()) {
            total = total + this.Basket.get(i).price();
        }
        return total;
    }
    
    public void print() {
        for (String i:this.Basket.keySet()) {
            System.out.println(this.Basket.get(i));
        }
    }
}
