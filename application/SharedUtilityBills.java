/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

public class SharedUtilityBills extends Expenses{
    private float electricity;
    private float water;
    private float cleaning;
    private float otherExpenses;

    
    public SharedUtilityBills(){
        electricity=0;
        water=0;
        cleaning=0;
        otherExpenses=0;
    }
    
    //SETTERS
    public void set(float electricity,float water,float cleaning,float otherExpenses){
        setElectricity(electricity);
        setWater(water);
        setCleaning(cleaning);
        setOtherExpenses(otherExpenses);
    }
    public void setElectricity(float electricity){
        this.electricity=electricity;
    }
    public void setWater(float water){
        this.water=water;
    }
    public void setCleaning(float cleaning){
        this.cleaning=cleaning;
    }
    public void setOtherExpenses(float otherExpenses){
        this.otherExpenses=otherExpenses;
    }
     
    //GETTERS
    public float getElectricity(){
        return electricity;
    }
    public float getWater(){
        return water;
    }
    public float getCleaning(){
        return cleaning;
    }
    public float getOtherExpenses(){
        return otherExpenses;
    }
    public float getTotal(){
        return electricity+water+cleaning+otherExpenses;
    }
}
