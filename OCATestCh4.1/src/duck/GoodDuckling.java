/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

/**
 *
 * @author nickp_000
 */
public class GoodDuckling {
    public void makeNoise(){
        MotherDuck duck = new MotherDuck();
        duck.quack();
        System.out.println(duck.noise);
    }
}
