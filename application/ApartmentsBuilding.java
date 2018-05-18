/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

public class ApartmentsBuilding {
    
    private String adress;
    private String city;
    private String postalCode;
    private int numberOfApartments;
    private String adminName;
    private String adminPhone;
    private int squareMeters;
    
    private int counter=0;
    
    public ApartmentsBuilding(){
        adress="";
        city="";
        postalCode="";
        numberOfApartments=0;
        adminName="";
        adminPhone="";
        squareMeters=0;
    }
    
    //SETTERS
    public void set(String adress,String city,String postalCode,int  numberOfApartments,String adminName,String adminPhone,int squareMeters){
        setAdress(adress);
        setCity(city);
        setPostalCode(postalCode);
        setNumberOfApartments(numberOfApartments);
        setAdminName(adminName);
        setAdminPhone(adminPhone);
        setSquareMeters(squareMeters);
    }
    
    public void setAdress(String adress){
        this.adress=adress;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setPostalCode(String postalCode){
        if(postalCode.length()>5){
            counter++;
        }
        else{
            this.postalCode=postalCode;
        }
    }
    public void setNumberOfApartments(int numberOfApartments){
        if(numberOfApartments>99 || numberOfApartments<2){
            counter++;
        }
        else{
            this.numberOfApartments=numberOfApartments;
        }
    }
    public void setAdminName(String adminName){
        this.adminName=adminName;
    }
    public void setAdminPhone(String adminPhone){
        if(adminPhone.length()!=10){
            counter++;
        }
        else{
            this.adminPhone=adminPhone;
        }
    }
    public void setSquareMeters(int squareMeters){
        this.squareMeters=squareMeters;
    }
    
    //GETTERS
    
    public String getAdress(){
        return adress;
    }
    public String getCity(){
        return city;
    }
    public String getPostalCode(){
        return postalCode;
    }
    public int getNumberOfApartments(){
        return numberOfApartments;
    }
    public String getAdminName(){
        return adminName;
    }
    public String getAdminPhone(){
        return adminPhone;
    }
    public int getSquareMeters(){
        return squareMeters;
    }
    public int getCounter(){
        return counter;
    }
    
}
