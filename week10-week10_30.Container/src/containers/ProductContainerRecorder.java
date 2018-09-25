/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author SteveWang
 */
public class ProductContainerRecorder extends ProductContainer{
    //private double volume;
    private ContainerHistory history;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName,capacity);
        //this.volume = initialVolume;
        this.history = new ContainerHistory();
        super.addToTheContainer(initialVolume);
        this.history.add(initialVolume);
        
    }
    
    public String history() {
        return this.history.toString();
    }
    
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        //super.getVolume() += amount;
        this.history.add(super.getVolume());
    }
    public double takeFromTheContainer(double amount){
        double numb = super.takeFromTheContainer(amount);
        //this.volume -= amount;
        this.history.add(super.getVolume());
        return numb;
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+ this.getName());
        System.out.println("History: "+ this.history.toString());
        System.out.println("Greatest product amount: "+ this.history.maxValue());
        System.out.println("Smallest product amount: "+ this.history.minValue());
        System.out.println("Average: "+ this.history.average());
        System.out.println("Greatest change: "+ this.history.greatestFluctuation());
        System.out.println("Variance: "+ this.history.variance());
        
        
    }
}
