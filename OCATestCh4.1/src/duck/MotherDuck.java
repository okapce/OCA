/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

/**
 * Method for mother ducks
 * @author nickp_000
 */
public class MotherDuck {
    /**
     * come on feel the noise
     */
    String noise = "quack";
    
    /**
     * Does quack
     * @param nums is not used
     * @see duck.MotherDuck#makeNoise() makeNoise
     * @return void
     * @link duck.MotherDuck#makeNoise() makeNoise
     */
     void quack(){
        System.out.println(noise);
    }
    /**
     * this one does the noise
     */
    private void makeNoise(){
        quack();
    }
}
