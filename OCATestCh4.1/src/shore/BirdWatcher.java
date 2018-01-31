/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shore;

/**
 *
 * @author nickp_000
 */
public class BirdWatcher {
    public void watchBird(){
        Bird bird = new Bird();
        bird.floatInWater();
        System.out.println(bird.text);
    }
}
