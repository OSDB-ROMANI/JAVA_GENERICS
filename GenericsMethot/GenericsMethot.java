/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsMethot;

/**
 *
 * @author Paolo
 */
public class GenericsMethot {
    private static <T> void stampa(T a){
        System.out.println(a);
    }
    
    public static void main (String[] args){
        stampa(125);
        stampa(true);
        stampa("ciao mondo");
    }
}
