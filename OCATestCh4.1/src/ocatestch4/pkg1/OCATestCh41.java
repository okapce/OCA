/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocatestch4.pkg1;

/**
 *
 * @author nickp_000
 */
public class OCATestCh41 {

    public static void walk1(int... nums){}
    
    public static void walk2(int start, int... nums){
        System.out.println("length of nums: "+nums.length);
        for(int n : nums)System.out.println("nums is: "+n);
    }
    
    private String name = "Static class";
    public static void first(){}
    public static void second(){}
    public void third(){System.out.println(name);}
    

//varargs are only to be set at the end of the parameter list
    public static void main(String[] args) {
    walk2(1, 3, 50, 105); 
    //Java creates an array varargs with nums
//int... nums --> from the parameters, array of int named nums
    
    first();
    second();
    //third();
// third does not compile, static ref to non_static method
    new OCATestCh41().third(); 
    
    
    }
    
}
