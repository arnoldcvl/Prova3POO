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
public class JavaApplication21 {


    //private static Pai Tarefa1 = new Tarefa1();


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tarefa1 t1 = new Tarefa1();
        Thread th1 = new Thread(t1);
        Tarefa2 t2 = new Tarefa2();
        Thread th2 = new Thread(t2);
        
        th1.run();
        th2.run();
        
    }
    
}
