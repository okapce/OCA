/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocatestch4.pkg2;

import java.util.ArrayList;

/**
 *
 * @author nickp_000
 */
public class OCATestCh42 {

    private static int count;
    public OCATestCh42(){
        count++;
    }
    
    private final static int NUM_BUCKETS=45;
    
    private static final ArrayList<String> values = new ArrayList<>();
    
    //static initialization
    private static final int NUM_SECONDS_PER_HOUR;
    static{
    int numSecPerMin=60;
    int numMinPerHour=60;
    NUM_SECONDS_PER_HOUR= numSecPerMin*numMinPerHour;
    }
    
    private static int one;
    private static final int two;
    private static final int three=3;
    private static final int four;
    static{
    one=1;
    two=2;
    //three=3;
    //already initialized
    //two=4;
    //already initialized in static{}
    four=4;
    }
    
    
//---------------------------------------------//
    public static void main(String[] args) {
    
    OCATestCh42 o1 = new OCATestCh42();
    OCATestCh42 o2 = new OCATestCh42();
    OCATestCh42 o3 = new OCATestCh42();
        System.out.println(count);
//static variables are good at counting instances.
    
    //constants are 'final static'
    //NUM_BUCKETS=5;
    //you CANNOT assign values to a final static (constant)
    
//Even for Array you can final static and change values, 
//but you can't reassign final values to point differetn object
    values.add("changed");
    values.add("not quite");
        System.out.println(values);
    values.set(0, "tippy");
        System.out.println(values);
    values.remove(0);
        System.out.println(values);
    
    //Passing Data Among Methods
    int num = 4 ;
    newNumber(5);
        System.out.println(num);
        
    String name = "Webby";
    speak(name);
        System.out.println(name);
        
    StringBuilder nombre = new StringBuilder();
    speak(nombre);
        System.out.println(nombre);
    
    int numerou=1;
    String letras="abc";
    numerou=number(numerou);
    letras=letters(letras);
        System.out.println(numerou+letras);
    
    }
    public static int number(int number){
        number++;
        return number;
    }
    public static String letters(String letters){
        letters+="d";
        return letters;
    }
    public static void speak(String name){
        name="Sparky";
    }
    
    public static void speak(StringBuilder nombre){
        nombre.append("Webby");
    }
    public static void newNumber(int num){
        num=8;
    }
    
    
    
}
