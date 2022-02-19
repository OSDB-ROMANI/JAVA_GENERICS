/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsExtends;

/**
 *
 * @author Paolo
 */
public class AnimaleGenerics <T extends Animale>{
    private T t;
    
    public AnimaleGenerics(T t){
        this.t = t;
    }
    
    public void hoFame(){
        t.fame();
    }
    
    public T sono(){
        return t;
    }
}
