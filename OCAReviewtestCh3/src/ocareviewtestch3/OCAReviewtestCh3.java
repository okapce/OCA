/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocareviewtestch3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nickp_000
 */
public class OCAReviewtestCh3 {

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
                System.out.println("1) ");
                test1();
                break;
            
            case 2:
                System.out.println("2) ");
                test2();
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
               
            case 21:
                System.out.println("21)");
                test21();
                break;
               
            case 22:
                System.out.println("22)");
                test22();
                break;
               
            case 23:
                System.out.println("23)");
                test23();
                break;
               
            case 24:
                System.out.println("24)");
                test24();
                break;
               
            case 25:
                System.out.println("25)");
                test25();
                break;
               
            case 26:
                System.out.println("26)");
                test26();
                break;
               
            case 27:
                System.out.println("27)");
                test27();
                break;
               
            case 28:
                System.out.println("28)");
                test28();
                break;
               
            case 29:
                System.out.println("29)");
                test29();
                break;
               
            case 30:
                System.out.println("30)");
                test30();
                break;
               
            case 31:
                System.out.println("31)");
                test31();
                break;
               
            case 32:
                System.out.println("32)");
                test32();
                break;
                
            case 33:
                System.out.println("33)");
                test33();
                break;
               
               
           default:
               System.out.println("choose another option");
               break;
            }
        }
    }
    
    public static void test1(){
        int numFish=3;
        String fishType="tuna";
        //String anotherFish=numFish+1;
        System.out.println("Won't compile, int can't be converted to String");
    }
    
    public static void test2(){
      String s = "Hello";
      String t = new String(s);
      if("Hello".equals(s))System.out.println("one");
      if(t==s)System.out.println("two");
      if(t.equals(s)) System.out.println("three");
      if("Hello"==s)System.out.println("four");
      if("Hello"==t)System.out.println("five");
        System.out.println("s is "+s);
        System.out.println("t is "+t);
    }
    
    public static void test3(){
    
    }
    
    public static void test4(){
    StringBuilder sb = new StringBuilder();
    sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);
    }
    
    public static void test5(){
    String s1 = "java";
    StringBuilder s2 = new StringBuilder("java");
    //if(s1==s2)
        System.out.println("1");
    
    if(s1.equals(s2)){
        System.out.println("2");
    }
        System.out.println("Wont compile, cant compare string vs stringbuilder");
    }
    
    
    public static void test6(){
    String roar1="roar";
    String excl ="!!!";
    String roar3=roar1.concat("!!!");
    String roar4= roar1.concat(excl);
    StringBuilder roar2 = new StringBuilder("roar");
    roar2.append("!!!");
        System.out.println(roar1+roar2);
        System.out.println("roar3..."+roar1+roar3);
        System.out.println("roar4..."+roar1+roar4);
        System.out.println(roar1.concat(excl));
//String is inmutable, so a concat won't do anything.
    //concat will only work within a print
    }
    
    public static void test7(){
    String letters= "abcdef";
        System.out.println(letters.length());
        System.out.println(letters.charAt(3));
        System.out.println(letters.charAt(6));
    //exception at line of charAt(6), 5 is max
    }
    
    public static void test8(){
    String numbers="012345678";
        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(7,7));
        System.out.println(numbers.substring(7));
    //substring finishes BEFORE indicated index
    }
    
    public static void test9(){
       String s = "purr";
       s.toUpperCase();
       s.trim();
       String s1 = s.substring(1,3);
       //s is imutable, so substring doesn't do anything
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s.substring(1,3));
       s+=" two";
        System.out.println(s.length());
    }
    
    public static void test10(){
        String a ="";
        a+=2;
        System.out.println(a);
        a+='c';
        System.out.println(a);
        a+=false;
        if(a=="2cfalse") System.out.println("==");
        if(a.equals("2cfalse")) System.out.println("equals");
    }
    
    
    public static void test11(){
    int total = 0;
    StringBuilder letters = new StringBuilder("abcdefg");
    total+=letters.substring(1,2).length();
    total+=letters.substring(6,6).length();
    //total+=letters.substring(6,5).length();
        System.out.println(total);
    
    }
    
    public static void test12(){
    StringBuilder numbers = new StringBuilder("0123456789");
    numbers.delete(2,8);
    numbers.append("-").insert(2,"+");
        System.out.println(numbers);
    }
    
    public static void test13(){
    //StringBuilder b = "rumble";
    StringBuilder b = new StringBuilder("rumble");
    b.append(4).deleteCharAt(3).delete(3, b.length()-1);
        System.out.println(b);
        
    }
    
    public static void test14(){
    StringBuilder puzzle = new StringBuilder("Java");
    puzzle.reverse();
        System.out.println(puzzle);
    }
    
    
    public static void test15(){
    int[][] scores = new int[5][];
    Object[][][] cubbies = new Object[3][0][5];
    //String[] beans = new beans[6];
    java.util.Date[] dates[] = new java.util.Date[2][];
    //int[][] types = new int[];
    //int[][] java = new int[][];
    }
    
    public static void test16(){
    char[] c = new char[2];
    int length = c.length;
        System.out.println(length);
    }
    
    public static void test17(){
    ArrayList l = new ArrayList();
    int length =  l.size();
    }
    
    public static void test18(){
    
    }
    
    public static void test19(){
    
    }
    
    public static void test20(){
    List<String> list = new ArrayList<String>();
    list.add("one");
    list.add("two");
    //list.add(7);
    for(String s : list) System.out.println(s);
    }
    
    public static void test21(){
    ArrayList<Integer> values = new ArrayList<>();
    values.add(4);
    values.add(5);
    values.set(1, 6);
    values.remove(0);
    for(Integer v : values) System.out.println(v);
        
    }
    
    public static void test22(){
    int[] random = {6, -4, 12, 0, -10};
    int x = 12;
    int y = Arrays.binarySearch(random, x);
        System.out.println(y);
        
    }
    
    public static void test23(){
    List<Integer> list = Arrays.asList(10, 4, -1, 5);
    Collections.sort(list);
    Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array[0]);        
    }
    
    public static void test24(){
    String[] names = {"Tom", "Dick", "Harry"};
    //List<String> list = names.asList();
    
        
    }
    
    public static void test25(){
    List<String> hex = Arrays.asList("30", "8", "3A", "FF");
    Collections.sort(hex);
    int x = Collections.binarySearch(hex, "8");
    int y = Collections.binarySearch(hex, "3A");
    int z = Collections.binarySearch(hex, "4F");
        System.out.println(x+""+y+""+z);
        
    }
    
    public static void test26(){
    List<Integer> ages = new ArrayList<>();
    ages.add(Integer.parseInt("5"));
    ages.add(Integer.valueOf("6"));
    ages.add(7);
    ages.add(null);
    for(int age:ages) System.out.println(age);
        
    }
    
    public static void test27(){
    List<String> one = new ArrayList<String>();
    one.add("abc");
    List<String> two = new ArrayList<>();
    two.add("abc");
    if(one==two)
            System.out.println("A");
    else if (one.equals(two))
            System.out.println("B");
    else
            System.out.println("C");
    }
    
    public static void test28(){
    
        
    }
    
    public static void test29(){
    LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
    date.plusDays(2);
    //date.plusHours(3); 
    //wont compile 'cuz LocalDate doesnt have plushHours
        
    }
    
    public static void test30(){
    LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        System.out.println(date.getYear()+ " "+ date.getMonth()+ " "+
                date.getDayOfMonth());
    //cant have 40 days in a month
        
    }
    
    public static void test31(){
    LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
    date.plusDays(2);
    LocalDate date1 = date.plusDays(2);
    date.plusYears(3);
    date1=date.plusYears(3);
        System.out.println(date.getYear()+ " "+ date.getMonth()+ " "+ 
                date.getDayOfMonth());
        System.out.println(date1.getYear()+ " "+ date1.getMonth()+ " "+ 
                date1.getDayOfMonth());
        
        
    }
    
    public static void test32(){
    LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
    Period p = Period.of(1,2,3);
    d= d.minus(p);
    DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(d.format(f));
        
    }
    
    public static void test33(){
    LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
    Period p = Period.ofDays(1).ofYears(2);
    d= d.minus(p);
    DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(f.format(d));
    
        
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
