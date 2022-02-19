/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esgenerics;

/**
 *
 * @author Paolo
 */
public class EsGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Associamo il tipo dinamicamente
        EsempioGenerics eg = new EsempioGenerics(true,1578.25);
        eg.print();
        //Il tipo cambia
        eg.setAttributi("ciao", "mondo");
        eg.print();
        EsempioGenerics<Boolean,String> eg1 = new EsempioGenerics<>(true,"ciao");
        eg1.print();
        //Il tipo non può cambiare
        eg1.setAttributi("ciao", "mondo");
        eg1.print();   
    }
    
}
