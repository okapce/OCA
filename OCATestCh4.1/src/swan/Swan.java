/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swan;
import shore.Bird;
/**
 * unlike inland.BirdWatcherFromAfar, this class extends Bird
 * and so the protected access allows to call the method and variable
 * @author nickp_000
 */
public class Swan extends Bird {
    /**
     * calls shore.Bird without creating object
     */
    public void swim(){
        floatInWater();
        System.out.println(text);
    }
    
    /**
     * calls shore.Bird with creating object
     */
    public void helpOtherSwanSwim(){
        Swan other = new Swan();
        other.floatInWater();
    }
    
    public void helpOtherBirdSwim(){
        Bird other = new Bird();
        other.floatInWater();
        System.out.println(other.text);
    }
//this method isn't the inherited method like 
//helpOtherSwanSwim, this is a direct call of 
//Bird REFERENCE, it's in another package 
//and and isn't inheriting Bird, so protected wont work

}

