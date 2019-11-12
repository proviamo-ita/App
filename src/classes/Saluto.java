/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Alessandro Quirile
 */
public class Saluto {
    
    public void stampa(String msg){
        System.out.println(msg);
    }
    
    /**
     * Stampa in base al sesso.
     * @param sesso
     * @param msg 
     */
    public void stampa(String sesso, String msg){
        System.out.println(msg + ", signore");
    }
    
}
