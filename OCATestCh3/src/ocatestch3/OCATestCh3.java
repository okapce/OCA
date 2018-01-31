/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocatestch3;

/**
 *
 * @author nickp_000
 */
public class OCATestCh3 {

    static java.util.Scanner leer = new java.util.Scanner(System.in); 
    
    public static class Tiger{
        String name;
    }
    
    public static void main(String[] args) {
    System.out.println("Ingrese numero: ");
    byte x = leer.nextByte();
    if(x==0){
        System.out.println("is zero");
    }else if (x==1){
        System.out.println("is one");
    }else{
        System.out.println("is something else from zero or one");
    }
    
    String a = "Stringit-myboy";
    String[] b = a.split("-");
    
    
    System.out.println("b[0] is: "+b[0]);
    System.out.println("b[1] is: "+b[1]);
    
    System.out.println("b[0]+\" \"+b[1] is: "+b[0]+" "+b[1]);
    
    b[0].concat(b[1]);
    System.out.println("b[0] after b[0].concat(b[1] is "+b[0]);
    
    
    System.out.println("b[0].concat(b[1] is: "+b[0].concat(b[1]));
    b[0]=b[0].concat(b[1]);
    System.out.println("b[0] after b[0]=b[0].concat(b[1]) is: "+b[0]);
    
    
    //---------------------------------------------//
    //contains
    String toTest = "   Todayisthe Dayto do it   a";
    String testIt = "oday";
    boolean isIt = toTest.contains(testIt);
    System.out.println("'"+toTest+"' has the chars "+testIt+" in it: "+isIt);
    
    //replace
    String newtoTest=toTest.replace("t", "T");
    System.out.println("'"+toTest+"' has replaced the t with T --> "+newtoTest);
    
    //trim
    toTest.trim();
    System.out.println(toTest);
    System.out.println(toTest.trim());
    String trimmed = toTest.trim();
    System.out.println(trimmed);
        
    //StringBuilder
    String alpha ="";
        for (char current = 'a'; current <= 'z'; current++) {
            alpha+=current;
            System.out.println(alpha);
        }
//27 objects have been instantiated -> very inefficient
//StringBuilder creates String without storing all those values
    StringBuilder sb = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++) {
        sb.append(current);
            System.out.println(sb);
        }
    
    StringBuilder sb1 = new StringBuilder("start, ");
    sb1.append("middle, ");
    StringBuilder same = sb1.append("end");
    System.out.println(same);
    //sb1 and same point to al mismo objecto
    StringBuilder one = new StringBuilder("abc");
    StringBuilder two = one.append("de");
    two = two.append("f").append("g");
    System.out.println("one is "+one);
    System.out.println("two is "+two);
    boolean onetwo = one.equals(two);
        System.out.println("one equals two: "+onetwo);
    //one and two point to the same object
//if new StringBuilder was called on two, then it would be differetn objects
    StringBuilder uno = new StringBuilder("abc");
    StringBuilder dos = uno.append(new StringBuilder().append("de"));
    dos = dos.append("f").append("g");
    System.out.println("uno is "+uno);
    System.out.println("dos is "+dos);
    boolean unoydos = uno.equals(dos);
    System.out.println("uno equals dos: "+unoydos);
    
    StringBuilder bs1 = new StringBuilder();
    StringBuilder bs2 = new StringBuilder("animal");
    StringBuilder bs3 = new StringBuilder(10);
    //"animalistic" has 11 characters
    bs3.append("animalistic");
    int lengthBS3=bs3.length();
    System.out.println(bs3+" is "+lengthBS3+" characters long");
    bs3.append("ssssss");
    System.out.println(bs3);

    //insert()
    StringBuilder ins = new StringBuilder("animals");
    ins.insert(7, "-");
    ins.insert(0, "-");
    System.out.println(ins);
    
    //delete and deleteCharAt()
    System.out.println("sb is "+sb);
    System.out.println("sb deleting at position 1, 3 chars, is "+sb.delete(1,3));
    System.out.println("sb is now "+sb);
    System.out.println("sb deleting at char position 1 is "+sb.deleteCharAt(1));
    
    //reverse
    sb.reverse();
    System.out.println("sb in reverse: "+sb);
    
    //toSTring
    String s = sb.toString();
    //s is inmutable
    System.out.println(s);
    
    //equality ==
    System.out.println("one is "+one);
    System.out.println("two is "+two);
    if(one==two){
        System.out.println("is one == two: "+true);
    }else{
        System.out.println("is one == two: "+false);
    }
    System.out.println("uno is "+uno);
    System.out.println("dos is "+dos);
    if(uno==dos){
        System.out.println("is uno == dos: "+true);
    }else{
        System.out.println("is uno == dos: "+false);
    }    
    
    StringBuilder guan = new StringBuilder();
    StringBuilder tiew = new StringBuilder();
    StringBuilder tree = guan.append("a");
    boolean guantiew = guan==tiew;
    System.out.println("is guan == tiew: "+guantiew);
    boolean guantree = guan==tree;
    System.out.println("is guan == tree: "+guantree);
    
    String x1 = new String("Hello World");
    String y1 = "Hello World";
    boolean xisy = x1==y1;
    boolean xequalsy = x1.equals(y1);
    System.out.println("x1 is "+x1+" and y1 is "+y1+" ... is x1==y2: "+xisy);
    System.out.println("x1 is "+x1+" and y1 is "+y1+" ... is x1.equals(y2): "+xequalsy);
    // == is for objects, equals for characters.

    Tiger t1 = new Tiger();
    Tiger t2 = new Tiger();
    Tiger t3 = t1;
    boolean toneone = t1 == t1;
        System.out.println("t1 == t1 : "+toneone);
    boolean tonetwo = t1==t2;
        System.out.println("t1 == t2 : "+tonetwo+" different object");
    boolean toneEtwo = t1.equals(t2);
        System.out.println("t1 equals t2 : "+toneEtwo+" different object");
    boolean toneEthree = t1.equals(t3);
    boolean tonethree =  t1==t3;
        System.out.println("t1 == t3: "+tonethree+" same object");
        System.out.println("t1 equals t3: "+toneEthree+" same object");
    
    
    
    
    }
    
}
