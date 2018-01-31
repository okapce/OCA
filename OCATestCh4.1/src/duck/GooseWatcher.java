/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;
import goose.Goose;
/**
 * GooseWatcher is not int the same package as Bird
 * nor does it extend Bird. Goose extends Bird. That
 * only refers to floatInWater()
 * @author nickp_000
 */
public class GooseWatcher {
    public void watch(){
        Goose goose = new Goose();
        goose.floatInWater();
        
    }
}
