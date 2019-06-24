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
public class Papagaio extends Ave{

    private String frase;
    
    public Papagaio(String n, boolean v, String f){
        super(n, v);
        setFrase(f);
    }
    
    public String getFrase(){
        return frase;
    }
    
    public void setFrase(String f){
        this.frase = f;
    }
       
    public void talk(){
        System.out.println(getFrase());
    }
}