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
public class Arara extends Ave{
    
    public Arara(String n, boolean v){
        super(n,v);
    }
       
    public void talk(){
        //super.talk(); caso eu queria imprimir o talk de ave
        System.out.println("arara, arara");
    }
}