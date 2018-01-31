/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inland;
import shore.Bird;

/**
 * class is to test out protected from outside package
 * meaning it shouldn't work here even when the code is
 * the same as in BridWatcher in shore, here being from 
 * another package, it wont work
 * @author nickp_000
 */
public class BirdWatcherFromAfar {
    public void watchBird(){
        Bird bird = new Bird();
        bird.floatInWater();
    //floatInWater is protected
        System.out.println(bird.text);
        //text is protected
    }
}
