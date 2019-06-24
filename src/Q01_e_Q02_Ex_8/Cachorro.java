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
public class Cachorro extends Mamifero{
    
    private boolean lateAlto;
    
    public Cachorro (String n, int p, boolean l){
        super(n, p);
        setLateAlto(lateAlto);
    }
    
    public boolean isLateAlto(){
        return lateAlto;
    }

    public void setLateAlto(boolean l){
        this.lateAlto = l;
    }
    
    public void talk(){
        System.out.println("Au, au");
    }
    
    
}