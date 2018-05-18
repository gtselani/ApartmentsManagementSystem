/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

public class Apartment {
    private int buildingID;
    private int floor;
    private String ID;
    private String ownerName;
    private int squareMeters;
    private String ownerPhone;
    private float millimeters;
    
    private int counter=0;
    
    public Apartment(){
        buildingID=0;
        floor=0;
        ID="";
        ownerName="";
        squareMeters=0;
        ownerPhone="";
        millimeters=0;
    }
    
    //SETTERS
    public void set(int buildingID,int floor,String ID,String ownerName,int squareMeters,String ownerPhone,float millimeters){
        setBuildingID(buildingID);
        setFloor(floor);
        setID(ID);
        setOwnerName(ownerName);
        setSquareMeters(squareMeters);
        setOwnerPhone(ownerPhone);
        setMillimeters(millimeters);
    }
    
    
    public void setBuildingID(int buildingID){
        this.buildingID=buildingID;
    }
    public void setFloor(int floor){
        this.floor=floor;
    }
    public void setID(String ID){
        this.ID=ID;
    }
    public void setOwnerName(String ownerName){
        this.ownerName=ownerName;
    }
    public void setSquareMeters(int squareMeters){
        this.squareMeters=squareMeters;
    }
    public void setOwnerPhone(String ownerPhone){
        if(ownerPhone.length()!=10){
            counter++;
        }
        else{
            this.ownerPhone=ownerPhone;
        }
    }
    public void setMillimeters(float millimeters){
        this.millimeters=millimeters;
    }
    
    //GETTERS
    
    public int getBuildingID(){
        return buildingID;
    }
    public int getFloor(){
        return floor;
    }
    public String getID(){
        return ID;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public int getSquareMeters(){
        return squareMeters;
    }
    public String getOwnerPhone(){
        return ownerPhone;
    }
    public float getMillimeters(){
        return millimeters;
    }
    public int getCounter(){
        return counter;
    }
}
