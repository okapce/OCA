/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shore;

/**
 * Just prints a text saying "floating"
 * @author nickp_000
 */
public class Bird {
    /**
     * text says "floating"
     */
     protected String text = "floating";
    
    /**
     * protected method that prints the text "floating"
     */
    protected void floatInWater(){
        System.out.println(text);
    }
}
