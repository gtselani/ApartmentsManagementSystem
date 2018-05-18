/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

public class Heating extends Expenses{
    private float valueOfHeating;
    private float burnerMaintenance;
    
    public Heating(){
        valueOfHeating=0;
        burnerMaintenance=0;
    }
    
    //SETTERS
    public void set(float valueOfHeating,float burnerMaintenance){
        setValueOfHeating(valueOfHeating);
        setBurnerMaintenance(burnerMaintenance);
    }
    public void setValueOfHeating(float valueOfHeating){
        this.valueOfHeating=valueOfHeating;
    }
    public void setBurnerMaintenance(float burnerMaintenance){
        this.burnerMaintenance=burnerMaintenance;
    }
    //GETTERS
    public float getValueOfHeating(){
        return valueOfHeating;
    }
    public float getBurnerMaintenance(){
        return burnerMaintenance;
    }
    public float getTotal(){
        return valueOfHeating+burnerMaintenance;
    }
}
