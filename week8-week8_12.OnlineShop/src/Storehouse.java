import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
public class Storehouse {
    private Map<String, Integer> itemsPrice = new HashMap<String, Integer>();
    private Map<String, Integer> itemsStock = new HashMap<String, Integer>();
    
    public void addProduct(String product, int price, int stock) {
        this.itemsPrice.put(product, price);
        this.itemsStock.put(product, stock);
        
    }
    
    public int price(String product){
        if (this.itemsPrice.get(product) != null){
            return this.itemsPrice.get(product);
        }
        return -99;
    }
    
    public int stock(String product) {
        if (this.itemsStock.get(product) != null){
            return this.itemsStock.get(product);
        }
        return 0;
    }
    
    public boolean take(String product){
        if (this.itemsStock.get(product) != null && this.itemsStock.get(product) > 0) {
            
            this.addProduct(product, this.itemsPrice.get(product), this.itemsStock.get(product)-1);
            return true;
        }
        return false;
    }
    public Set<String> products(){
        return this.itemsPrice.keySet();
    }
        
        
    
}
