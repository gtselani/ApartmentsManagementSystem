/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

public class JointΟwnership extends Expenses{
    private float ESFESS;
    private float other;
    
    
    public void JointOwnership(){
        ESFESS=0;
        other=0;
    }
    
    
    //SETTERS
    public void set(float ESFESS,float other){
        setESFESS(ESFESS);
        setOther(other);
    }
    public void setESFESS(float ESFESS){
        this.ESFESS=ESFESS;
    }
    public void setOther(float other){
        this.other=other;
    }
    //GETTERS
    public float getESFESS(){
        return ESFESS;
    }
    public float getOther(){
        return other;
    }
    public float getTotal(){
        return ESFESS+other;
    }
}
