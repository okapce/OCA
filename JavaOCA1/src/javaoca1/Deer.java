/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoca1;

/**
 *
 * @author nickp_000
 */
public class Deer {

    public Deer(){System.out.print("Deer");}
    public Deer(int age){System.out.print("DeerAge");}
    private boolean hasHorns(){return false;}
    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println(","+deer.hasHorns());
    }
}
class Reindeer extends Deer{
    public Reindeer(int age){System.out.print("Reindeer");}
    public boolean hasHorns(){return true;}
}