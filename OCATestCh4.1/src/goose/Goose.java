/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goose;
import shore.Bird;

/**
 * equivalent of Swan example, however 2nd method
 * object is goose, but stored in Bird reference
 * therefore, being a reference to Bird clas that's
 * in a different package and Bird isn't a subclass of Bird
 * it won't work
 * @author nickp_000
 */
public class Goose extends Bird {
    public void helpGooseSwim(){
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }
    public void helpOtherGooseSwim(){
        Bird other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }
    
}
