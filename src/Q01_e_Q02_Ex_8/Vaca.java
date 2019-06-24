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
public class Vaca extends Mamifero{
    
    private boolean temLeite;
    
    public Vaca(String n, int p, boolean t){
        super(n, p);
        setTemLeite(t);
    }
    
    public boolean isTemLeite(){
        return temLeite;
    }
    
    public void setTemLeite(boolean t){
        this.temLeite = t;
    }
    
    public void talk(){
        System.out.println("Muuu");
    }
}