/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocareviewtestch2;

import java.util.Scanner;
/**
 *
 * @author nickp_000
 */
public class OCAReviewTestCh2 {

static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean loop = true;
        while(loop){
        System.out.println();
        int opcion=menu();
        for (int i = 0; i < 50; ++i) System.out.println();
        
        switch(opcion){
            
            case 0:
                System.out.println("Terminating");
                loop=false;
                break;

            case 1:
                System.out.println("1) NA");
                break;
            
            case 2:
                System.out.println("2) NA");
                break;
                
            case 3:
                System.out.println("3)");
                test3();
                break;
            
            case 4:
                System.out.println("4)");
                test4();
                break;

            case 5:
                System.out.println("5)");
                test5();
                break;
            case 6:
                System.out.println("6)");
                test6();
                break;
            case 7:
                System.out.println("7)");
                test7();
                break;
            case 8:
                System.out.println("8)");
                test8();
                break;
            case 9:
                System.out.println("9)");
                test9();
                break;
            case 10:
                System.out.println("10)");
                test10();
                break;
            case 11:
                System.out.println("11)");
                test11();
                break;
            case 12:
                System.out.println("12)");
                test12();
                break;
            case 13:
                System.out.println("13)");
                test13();
                break;
            case 14:
                System.out.println("14)");
                test14();
                break;
            case 15:
                System.out.println("15)");
                test15();
                break;
            case 16:
                System.out.println("16)");
                test16();
                break;
            case 17:
                System.out.println("17)");
                test17();
                break;
            case 18:
                System.out.println("18)");
                test18();
                break;
            case 19:
                System.out.println("19)");
                test19();
                break;
            case 20:
                System.out.println("20)");
                test20();
                break;
               
               
           default:
               System.out.println("choose another option");
               break;
            }
        }
    }
    
    public static void test3(){
    int x= 0;
       while(x++ < 10){
           String message = x > 10 ? "Greater than":"false";
    //false can't be assigned to String
           System.out.println(message+", "+x);  
    }
    }
    
    public static void test4(){
        long x = 10;
        //int y=(int)2*x; --> won't work
        int y=2*(int)x;
        System.out.println("y is: "+y);
        
    }
    
    public static void test5(){
    java.util.List<Integer> list = new java.util.ArrayList<Integer>();
    list.add(10);
    list.add(14);
        for (int x: list) {
            if(x==10){
                System.out.print(x+", ");    
            }else{
                System.out.println(x);
            }
            break;
//break cuts the for loop, giving only 10, as output
        }
    }
    
    public static void test6(){
       int x= 4;
       long y = x * 4 - x++;
       if(y<10){
           System.out.println("Too Low");
       }else{
           System.out.println("Just Right");
       //}else{  
           System.out.println("2nd else Wont compile!!");
           System.out.println("Too High");
       }
    }
    
    public static void test7(){
    int x =5;
        System.out.println(x>2 ? x<4 ? 10 : 8 : 7 );
    }
    
    public static void test8(){
    boolean x = true, z = true;
    int y = 20;
    x = (y!=10)^(z=false);
        System.out.println("x is: "+x+", y is: "+y+", z is: "+z);
        
        System.out.println("Testing XOR: if == then false, if != then true");
        System.out.print("false^false: ");System.out.println(false^false);
        System.out.print("true^true: ");System.out.println(true^true);
        System.out.print("true^false: ");System.out.println(true^false);
        System.out.print("false^true: ");System.out.println(false^true);
    }
    
    public static void test9(){
        for (int i = 0; i < 10; ) {
            i=i++; 
//will add ++ after end of for operation, so change wont register for the for loop
            System.out.println("Hello world!! N°"+i);
        }
    }
    
    public static void test10(){
        byte a = 40, b= 50;
        //byte sum = (byte) a + b; 
        System.out.println("byte sum = (byte) a + b; --> WONT COMPILE");
        System.out.println("int sum = (byte) a+ b; is what this code runs");
        int sum = (byte) a + b ;
        System.out.println("sum is "+sum);
    }
    
    
    public static void test11(){
    int x = 5 * 4 % 3;
        System.out.println("5 * 4 % 3  is: "+x);
    }
    
    public static void test12(){
    int x = 0;
    String s = null;
    //if(x==s) System.out.println("Success");
        System.out.println("Wont compile");
    //else System.out.println("Failure");
    }
    
    public static void test13(){
    int x1 = 50, x2 = 75;
    boolean b = x1>=x2; //b = false;
    if(b=true) System.out.println("Success");
    //b==true is false, where b=true is just that
    else System.out.println("Failure");
    
    }
    
    public static void test14(){
    int c = 7;
    int result = 4;
    result += ++c;
    System.out.println("result is "+result);
    }
    
    
    public static void test15(){
    int x = 1, y= 15;
    while (x <10)
        y--;
        x++;
//with no {} it just runs first line, creating infitinte loop
    System.out.println("x is: "+x+", y is: "+y);
    }
    
    public static void test16(){
       int y =1 ;
        do{
       //int y = 1; 
//won't work, y inside block, while is outside block      
           System.out.println(y++ + " ");
       } while(y<=10);
    }
    
    public static void test17(){
        boolean keepGoing= true;
        int result  = 15, i = 10;
        do{
            i--;
            if(i==8) keepGoing=false;
            result -=2;
        }while(keepGoing);
        System.out.println("Result is "+result);
    }
    
    public static void test18(){
    int count=0;
    ROW_LOOP : for (int row = 1; row <= 3; row++) {
        for (int col = 0; col <= 2; col++) {
            if(row*col % 2 == 0) continue ROW_LOOP;
            count++;
            }
        System.out.println("Count is "+count);
        }
    }
    
    public static void test19(){
    int m = 9, n = 1, x = 0;
    while(m>n){
        m--;
        n+=2;
        x+=m+n;
    }
        System.out.println("x is "+x);
    }
    
    public static void test20(){
    final char a = 'A', d ='D';
    char grade = 'B';
    switch(grade){
        case a:
        case 'B':System.out.println("great");
        case 'C':System.out.println("good");break;
        case d:
        case 'F':System.out.println("not good");
    }
    }
    
    public static void test(){
    }
    
    
    public static int menu(){
        System.out.println("         MENU");
        System.out.println("-----------------------");
        System.out.println("1-20) Choose a question to run: ");
        System.out.println("0) Exit");
        int op = leer.nextByte();
        return op;
    }
}
    

