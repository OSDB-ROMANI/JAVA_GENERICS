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
public class EsempioEstensione {
    public static void main(String[] args){
        AnimaleGenerics<Gatto> ag = new AnimaleGenerics<>(new Gatto());
        Gatto g = ag.sono();
        System.out.println("sono un "+ g.sono);
        ag.hoFame();
        AnimaleGenerics<Cane> ag1 = new AnimaleGenerics<>(new Cane());
        Cane c = ag1.sono();
        System.out.println("sono un "+ c.sono);
        ag1.hoFame();
    }
}
