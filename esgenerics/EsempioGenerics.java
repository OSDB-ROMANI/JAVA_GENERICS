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
public class EsempioGenerics <T,K>{
    private T t;
    private K k;
    
    public EsempioGenerics(T t, K k){
        this.t = t;
        this.k = k;
    }
    
    public void print(){
        System.out.println("T: "+t+" K: "+k);
    }
    
    public void setAttributi(T t, K k){
        this.t = t;
        this.k = k;
    }
}
