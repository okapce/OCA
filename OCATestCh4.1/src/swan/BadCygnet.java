/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swan;

import duck.MotherDuck;
/**
 *
 * @author nickp_000
 */
public class BadCygnet {
    public void makeNoise(){
        MotherDuck duck  = new MotherDuck();
        duck.quack();
        //quack has no access modifier
        System.out.println(duck.noise);
        //noise has no access modifier
    }
}
