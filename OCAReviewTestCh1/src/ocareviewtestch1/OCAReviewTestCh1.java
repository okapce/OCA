/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocareviewtestch1;

/**
 *
 * @author nickp_000
 */
public class OCAReviewTestCh1 {
    int count;
    
    public static class WaterBottle{
        private String brand;
        private boolean empty; //initialized by default to false
    }
    
    public void OCAReviewTestCh1(){ //is a method with same name as class
    count = 4;     //isn't a constructor porque retorna void
    //remove void and count will be 4 instdead of 0
    }
    
    
    public static void main(String[] args) {
    OCAReviewTestCh1 s = new OCAReviewTestCh1();
    System.out.println("count is "+s.count);
    WaterBottle wb = new WaterBottle();    
    System.out.println("Empty = "+wb.empty);
    System.out.println("Brand = "+wb.brand);
    int a1 = 0b101;
    int a2 = 0xE;
    double d1 = 0xE;
    System.out.println("a1 is "+a1+", a2 is "+a2+" and d1 is "+d1);
    }
}

