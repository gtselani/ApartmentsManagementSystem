/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

public class Expenses {
    private static int buildingID;
    private static int year;
    private static String month;
    
    public Expenses(){
        buildingID=0;
        year=0;
        month="";
    }
    
    //SETTERS
    public void set(int buildingID,int year,String month){
        setBuildingID(buildingID);
        setYear(year);
        setMonth(month);
    }
    public void setBuildingID(int buildingID){
        this.buildingID=buildingID;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setMonth(String month){
        this.month=month;
    }
   
    //GETTERS
    public int getBuildingID(){
        return buildingID;
    }
    public int getYear(){
        return year;
    }
    public String getMonth(){
        return month;
    }
    public float getTotal(float k,float th,float s,float a){
        return k+th+s+a;
    }
}
