// CIS 183
// Lab Assigment 06
// chapter 7
// Giancarlo Bustos

import java.util.Random;


public class DiceRoll {

    public static void main(String[] args) {
               Random randomNumbers = new Random();
               int[] frequency = new int[13];
    
    
    for (int roll = 1; roll <= 36000; roll++)
            ++frequency[(1 + randomNumbers.nextInt(6))+(1 + randomNumbers.nextInt(6))];//two random numbers to represent two dice 
            System.out.printf("%s%10s%11s\n","Face","Frequency", "Percentage");
    
    for( int face = 2;face < frequency.length; face++){
            double getPercentage  = (36000-frequency[face]);
            double getPercentage2 = 100*(frequency[face]/getPercentage);//had to put them separate from getPercentage cus it would create error
    
    System.out.printf("%4d%10d%11.2f\n",face,frequency[face],getPercentage2);
    }//end of for
    }//end of main 
    }//end of class
