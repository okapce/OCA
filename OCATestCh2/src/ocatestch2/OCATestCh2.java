/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocatestch2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author nickp_000
 */
public class OCATestCh2 {

static Scanner leer = new Scanner(System.in);
 
    
    public static void main(String[] args) {
        int opcion= Menu();
        switch(opcion){
        default:
            System.err.println("Debió haber ingresado una opción válida... what is going to happen!??");
            break;
            
        case 1:
            
            System.out.println("Short max is "+Short.MAX_VALUE);
            System.out.println("Float max is "+Float.MAX_VALUE);
            System.out.println("Double max is "+Double.MAX_VALUE);
            short little = 11;
            byte tiny = 30;
            //int result;
            Integer result = tiny + little;
            //if trying to set result as an Byte or Short, 
            //since operator was used, it becomes an Integer
            short res = (short)(tiny+little);
            //can be overrided

            if(result instanceof Integer){
                System.out.println("Result is an Integer");
            }

            System.out.println("result of tiny ("+tiny+") + little ("+little+") is: "+result);
            System.out.println("result of tiny ("+tiny+") + little ("+little+") with overriding the short is: "+res);

            double x = 39.41;
            float y = 2.555f; //won't compile if f isn't added
            double respuesta = x*y;
            System.out.println("Respuesta es: "+respuesta);
            double testRes = little * y /x;
            System.out.println("mixing all of them gives: "+testRes);

            int counter = 0;
            System.out.println(counter);
            System.out.println(counter++); //add after
            System.out.println(counter);
            System.out.println(--counter); //substracts before
            System.out.println(counter);

            int a = 3;
            int b = ++a * 5 / a-- + --a;
            // b = 4 * 5 / 4 + 2
            System.out.println("a is "+a+" and b is "+b);

            System.out.println("Max value of int  + 1 :"+(2147483647+1));
    //with string present it just concats all three expresions, unless you use ()
            System.out.println(2147483647+1); //returns -2147483648

            int h = 2, j=3;
            h=h*j;
            System.out.println("h = h * j is "+h);
            h=2;
            h*=j;
            System.out.println("h*=j is "+h);

            short o = (short)19244015;
            System.out.println("short of 19244015 is "+o);
            //conversion from floating point to integral value 

            long notsoLong = 5;
            long supahLong = (notsoLong=3);
            System.out.println("notsoLong = "+notsoLong);
            System.out.println("supahLong = "+supahLong);

            int one =1 ;
            int two = 2;
            if( two == 2 ^ one ==1){
                System.out.println("\nYou are");
            }else{
                System.out.println("\nYou aren't");
            }

            boolean IamNick = true;
            boolean IamNotNick= false;
            if(IamNick!=IamNotNick){
                System.out.println("Nicky is not notNicky");
            }else{
                System.out.println("Nicky somehow is notNicky");
            }
            System.out.println("\nHaving a1 and a2 bieng the same string, but different instances and a1=a3;");
            testFile a1 = new testFile("thisString");
            testFile a2 = new testFile("thisString");
            testFile a3 = a1;
            System.out.print("is a1 == a2 ?: ");
            System.out.println(a1==a2);
            System.out.print("is a1 == a3 ?: ");
            System.out.println(a1==a3);
            System.out.print("is a2 == a3 ?: ");
            System.out.println(a2==a3);

            //both A) and B) are equivalent
            //A)
            int first = 10;
            final int second;
            if(first>5){
                second=2*first;
            }else{
                second= 3*first;
            }
            System.out.println("\nfirst is : "+first);
            //B)
            final int third=(first>5)?(2*first):(3*first);
            System.out.println("first is : "+first+", second is: "+second+" and thrid is: "+third);
            System.out.println("tertary operator can also be used in a print:");
            System.out.println("System.out.println((first>5)?'second printed is: '+(2*first):'third printed is: '+(3*first))");
            System.out.println((first>5)?"second printed is: "+(2*first):"third printed is: "+(3*first));
            
            
            System.out.println("\nThe counting is done with i declared outside of the for");
            int countIt;
            for (countIt = 0; countIt < 10; countIt++) {
                System.out.println("counting n°"+countIt);
            }
            // two variables withing the for statements
            for (int i = 0, g=2; i < 10 && g<8; i++, ++g) 
            {System.out.println("i is "+i+" and g is "+g);}
            
            
            //for each statement -> for(datatype NameInstanceRecievingInfoFromCollection : collection)
            System.out.println("\nforeach List");
            double[] randomNums = new double[3];
            for(double rdm : randomNums){
                rdm=Math.random()*7+1;
                System.out.println(rdm);
            }
            
            
            List<Double> nums = new ArrayList<Double>();
            System.out.println("\nforeach ArrayList");
            nums.add(Math.random()*10+1);
            nums.add(Math.random()*10+1);
            nums.add(Math.random()*10+1);
            for(Double n : nums){
                System.out.println(n);
            }
            
            //nested loops
            System.out.println("");
            int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
            for(int[] mySimpleArray : myComplexArray) {
            for(int i=0; i<mySimpleArray.length; i++) {
            System.out.print(mySimpleArray[i]);
            }
            System.out.println();
            }
            
        break;
            
        case 2:
            System.out.println("Quitting app");

        break;
        }
        
    }
    
    public static int Menu(){
            System.out.println("                  Menu");
            System.out.println("-----------------------------------------------------");
            System.out.println("1. Run main");
            System.out.println("2. Exit");
            int opcion=leer.nextByte();
            return opcion;
            
}
}
    

