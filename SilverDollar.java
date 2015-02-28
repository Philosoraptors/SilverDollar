/**
 * A cute little text version of the classic Silver Dollar game
 */

import java.lang.Math.*;
import java.util.*;

public class SilverDollar {
  
  boolean[] board;
  public static Vector<Integer> setSpaces = new Vector<Integer>(); 
  int coins;
  int location;
  
  public SilverDollar() { 
  }
  
  //this method gets a number of coins from the user and generates a random number of spaces to put before each coin
  public static void setupBoard(int c){
    System.out.println("How many coins do you want to try (1-10)? ");
    Scanner scan = new Scanner(System.in);
    int coins = scan.nextInt();
    int spaces;
    //get a random number of spaces to fill in before each coin
      for(int r=0; r < coins; r++){
         spaces = (int)(11*Math.random());
    //put the set of space numbers in a vector array
         setSpaces.add(spaces);
         }
     //prints the vector of the set of space numbers
     System.out.println("Here is the set of spaces placed before each coin: " + setSpaces);
    
  }
  
  public boolean moveCoin(int location){
    return true;
  }
  
  public boolean gameOver(){
    return true;
  }
 
  public static void main(String[] args) { 
    
    setupBoard(5);

    //drawBoard()
    //moveCoin();
    //gameOver();   
    
    
  }

  
}
