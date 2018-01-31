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
public class BadDuckling {
    public void makeNoise(){
            FatherDuck duck = new FatherDuck();
            duck.quack();
            
//quack() has private access in FatherDuck
            System.out.println(duck.noise);
//noise has private access in FatherDuck
        }
}
