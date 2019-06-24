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
public abstract class Animal {
    private String nome;
    
    public Animal(String n){    
        setNome(n);
    }
        
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void imprime(){
        System.out.println("Nome: " + getNome());
    }
    
    public abstract void talk(); 
}