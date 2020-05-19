// CIS 183
// Lab Assigment 04 
// Giancarlo Bustos
import java.util.Scanner;


public class SalesCalc {

    public static void main(String[] args) {
    
                         Scanner input = new Scanner(System.in);
                         int    enteredNumber,itemsSold;
                         double totalPrice,price,finalTotalPrice = 0;
                         
    do{
    
           System.out.printf(" Enter a product number from 1-5 OR 6 to quit:\nProduct 1: $2.98\nProduct 2: $4.50\nProduct 3: $9.98\nProduct 4: $4.49\nProduct 5: $6.87\n");
           enteredNumber = input.nextInt();
                     
                     switch (enteredNumber){
                      
                      case 1: price = 2.98; 
                      break;
                      
                      case 2: price = 4.50;
                      break;
                      
                      case 3: price = 9.98;
                      break;
                      
                      case 4: price = 4.49;
                      break;
                      
                      case 5: price = 6.87;
                      break; 
                      
                      default: price = 999;
                      break;
                  
     }//end of switch
       
     if (price != 999){
                    
            System.out.println("Product "+enteredNumber+" : $"+price+ "\nHow many products sold?");
            itemsSold  = input.nextInt();
            totalPrice = price*itemsSold;
            finalTotalPrice += totalPrice;         
            System.out.printf("Total : $%.2f%n " , totalPrice ); //  %.2f%n to round it by two decimals
   
    }//end of if1
    
    if (price == 999 && enteredNumber != 6) {
    
            System.out.println("Invalid number. TRY AGAIN");
     
   }//end of if2 
    
   }//end of do 

    while(enteredNumber != 6);
    System.out.printf("Final Total : $%.2f%n" , finalTotalPrice);

   }//end of main
   }//end of class