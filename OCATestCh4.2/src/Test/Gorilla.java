/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author nickp_000
 */
public class Gorilla {
    public static int count;
    public static void addGorilla(){count++;}
    public void babyGorilla(){count++;}
    public void announceBabies(){
        addGorilla();
        babyGorilla();
    }
    public static void annouceBabiesToEveryone(){
        addGorilla();
        //babyGorilla();
        //wont compile 'cuz babyGorilla nonstatic in static method
    }
    public int total;
    //public static average = total/count;
    //won't compile 'cuz total is not static
}
