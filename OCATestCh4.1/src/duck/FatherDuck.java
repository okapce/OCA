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
public class FatherDuck {
    private String noise ="quack";
    private void quack(){
        System.out.println(noise);
    }
    private void makeNoise(){
        quack();
    }
}
