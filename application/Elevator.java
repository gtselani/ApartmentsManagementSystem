/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

public class Elevator extends Expenses{
    private float elevatorMaintenanceCosts;
    private float sparePartsCosts;
    private float technicalCosts;
    
    //SETTERS
    public void set(float elevatorMaintenanceCosts,float sparePartsCosts,float technicalCosts){
        setElevatorMaintenanceCosts(elevatorMaintenanceCosts);
        setSparePartsCosts(sparePartsCosts);
        setTechnicalCosts(technicalCosts);
    }
    public void setElevatorMaintenanceCosts(float elevatorMaintenanceCosts){
        this.elevatorMaintenanceCosts=elevatorMaintenanceCosts;
    }
    public void setSparePartsCosts(float sparePartsCosts){
        this.sparePartsCosts=sparePartsCosts;
    }
    public void setTechnicalCosts(float technicalCosts){
        this.technicalCosts=technicalCosts;
    }
    //GETTERS
    public float getElevatorMaintenanceCosts(){
        return elevatorMaintenanceCosts;
    }
    public float getSparePartsCosts(){
        return sparePartsCosts;
    }
    public float getTechnicalCosts(){
        return technicalCosts;
    }
    public float getTotal(){
        return elevatorMaintenanceCosts+sparePartsCosts+technicalCosts;
    }
}
