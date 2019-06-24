/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q01_e_Q02_Ex_8;

/**
 *
 * @author HeiThor
 */
public abstract class Ave extends Animal{
    private boolean voa;
    
    public Ave(String n, boolean v){
        super(n);
        setVoa(v);
    }
    
    //boolean vira "is" e não get
    public boolean isVoa(){
        return voa;
    }

    public void setVoa(boolean voa){
        this.voa = voa;
    }
    
    public void talk(){
        System.out.println("Piu-Piu");
    }
}