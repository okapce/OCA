/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocatestch3.pkg2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nickp_000
 */
public class OCATestCh32 {

    
    
    public static void main(String[] args) {
    //Arrays
    int[] nums = new int[]{42, 55, 99};
//int[] numbers = new int[3] --> new instance of 3 item list
    int[] numeros = {10, 9, 100};
// new int[] can be redundant
    
//all of these do the same:
    //int[] animuls;
    //int [] animuls;
    //int animuls[];
    //int animuls [];
    
    String[] bugs = {"cricket", "beetle", "ladybug"};
    String [] aliases = bugs;
        System.out.println(bugs);
        System.out.println(aliases);
//both point to the same hash code/memory storage/object (reference)
    
    //sorting is by alphabetical order
    Arrays.sort(bugs);
    for(String string : bugs){
        if(string =="ladybug"){
            System.out.println(string);
        }else{
            System.out.print(string+" - ");
        }
    }
    Arrays.sort(nums);
    for(int n : nums){
        if(n==99){
            System.out.println(n);
         }else{
            System.out.print(n+", ");
    }
    }
    
    Arrays.sort(numeros);
    for(int n :  numeros){
        System.out.print(n+" ");
    }
    System.out.println("\nsort is alphabetical, therefore 1<9");
    
//if array has been sorted, search [binarySearch(list, object)] can be used
//nums, numero and bugs already sorted.
    System.out.print("Index for 'ladybug' in bugs is: ");
    System.out.println(Arrays.binarySearch(bugs, "ladybug"));
    
        int[] notsorted={3,2,1};
    System.out.println("not sorted is: [3,2,1]");
    System.out.print("not sorted looking for 2: ");
    System.out.println(Arrays.binarySearch(notsorted, 2));
    System.out.print("not sorted looking for 3: ");
    System.out.println(Arrays.binarySearch(notsorted, 3));
    System.out.print("sorted looking for 3: ");
        Arrays.sort(notsorted);
        int[] sorted=notsorted;
    System.out.println(Arrays.binarySearch(sorted, 3));
    System.out.print("sorted looking for 2: ");
    System.out.println(Arrays.binarySearch(sorted, 2));


    //multidimensional Array
    int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++){ 
                System.out.print(twoD[i][j]+" ");
            }
            System.out.println();
            
        }
    //same as above
        System.out.println("Enhanced loop: ");
        for(int[] inner : twoD){
            for(int num : inner){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    
        
    //no type
        List list = new ArrayList();
        list.add("hawk");
        list.add(Boolean.TRUE);
    System.out.println(list);
    
        List testList = new ArrayList<>();
        testList.add(true);
        testList.add("Green");
        testList.add(66);
    System.out.println(testList);
    
    //String type
    List<String> birds = new ArrayList<String>();
        birds.add("Hawk");
        birds.add(1, "robin");
        birds.add(0, "blue jay");
    System.out.println(birds);
        birds.add(1, "cardinal");//no sobreescribe
    System.out.println(birds);
    
    //remove
        birds.add("hawk1");
    System.out.println(birds);
    System.out.print("To remove hawk1: ");
    System.out.println(birds.remove("hawk1"));
    System.out.print("To remove tucan (does not exist): ");
    System.out.println(birds.remove("tucan"));
    System.out.println(birds);
    System.out.print("To birds.remove(1): ");
        birds.remove(1);
    System.out.println(birds);
    
    //set
    System.out.print("setting cardinal to pos 1: ");
        birds.set(1, "cardinal");
    System.out.println(birds);
    
    //isEmpty & size()
    System.out.println("Is birds empty: "+birds.isEmpty());
    System.out.println("List 'birds' size is of: "+birds.size());
    System.out.println("");

    //clear()
    System.out.println("Clearing out birds...");
        birds.clear();
    System.out.println("Is birds empty: "+birds.isEmpty());
    System.out.println("List 'birds' size is of: "+birds.size());

    //contains

    System.out.println("does birds contain 'hawk': "+birds.contains("hawk"));
    System.out.println("Creating/Adding birdOs...");
    List<String> birdos = new ArrayList<>();
        birdos.add("Hawk");
        birdos.add(1, "robin");
        birdos.add(0, "blue jay");
        birdos.add(1, "cardinal");//no sobreescribe
    System.out.println(birdos);
    System.out.println("now... does birdos contain 'hawk': "+birdos.contains("hawk"));
    System.out.println("now... does birdos contain 'Hawk': "+birdos.contains("Hawk"));

   //equals

    System.out.println("\nBirds: "+birds);
    System.out.println("Adding birds to birds");
        birds.add("Hawk");
        birds.add(1, "robin");
        birds.add(0, "blue jay");
        birds.add(1, "cardinal");
    System.out.println("Birds: "+birds);
    System.out.println("Birdos: "+birdos);
    System.out.println("birds.equals(birdos): "+birds.equals(birdos));
    System.out.println("Adding 'penguin' to birds...");
    birds.add("penguin");
    System.out.println("Birds: "+birds);
    System.out.println("Birdos: "+birdos);
    System.out.println("birds.equals(birdos): "+birds.equals(birdos));

    //---------------------------------//
    //Dates
   
    LocalDate date1 = LocalDate.of(2018, Month.JANUARY, 30);
    LocalDate date2 = LocalDate.of(2005, 4, 15);
    //can use int for month
    LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 15, 6, 15, 30);
//public static LocalDateTime of(int year, int month,
//int dayOfMonth, int hour, int minute, int second, int nanos)
    date1=date1.plusDays(3);
        System.out.println(date1);
    date1=date1.minusDays(3);
    
    LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
    LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
    
    while(start.isBefore(end)){
        System.out.println("give new toy: "+start);
        start=start.plusMonths(1);
    }
    System.out.println();
    
    
    //Period --> days/months/years
    start=LocalDate.of(2015, Month.JANUARY, 1);
    Period period = Period.ofMonths(1);
    while(start.isBefore(end)){
    System.out.println("Give new toy: "+start);
    start=start.plus(period);    
    }
    
        System.out.println();
    //formating dates
    LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
    LocalTime  time  = LocalTime.of(11, 12, 34);
    LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
    
    
    }   
}

