/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author aluno
 */
public class Tarefa1 extends Pai implements Runnable{
    
    public double fatorial(int valor1)
    {
        int fat = 1, i;
        for(i=2;i<=valor1;i++)
        {
            fat*=i;
        }
        int resultado = fat;
        return resultado;
    }
    
    @Override
    public void run(){
        
        System.out.println(fatorial(9));
        
    }
    
    
}
