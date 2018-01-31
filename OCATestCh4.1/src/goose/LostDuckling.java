/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goose;
import duck.DuckTeacher;
/**
 *
 * @author nickp_000
 */
public class LostDuckling {
    public void swim(){
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim();
        System.out.println("Thanks "+teacher.name);
    }
}
