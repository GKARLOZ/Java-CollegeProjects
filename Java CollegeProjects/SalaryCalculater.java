// CIS 183
// Lab Assigment 05
// chapter 6 
// Giancarlo Bustos

 import java.util.Scanner;


public class SalaryCalculater {

    public static void main(String[] args) {
    
        double hours,wage, overtimeWage,overtime,overtimePay,regardPay,total;
        String name = "Charlie bit me" ;
        Scanner input = new Scanner(System.in);
        
        //Get input from user
        
        while(!name.equals("adios")){


        System.out.println("Enter name or adios to end program");
        name = input.next();
        
        if (!name.equals("adios")){
        
        System.out.println("Enter number of hours worked");
        hours = input.nextDouble();

        System.out.println("Enter your wage");
        wage = input.nextDouble();
        
        //calculations      
        if(hours>40) {
  
           overtime      = hours - 40;
           overtimeWage  = wage+ (wage/2);
           overtimePay   = (overtime * overtimeWage);
           regardPay     = 40 * wage;  
           total = regardPay + overtimePay;
           System.out.println("Name: "+name+"\nHours: "+hours+"\nWage: $"+wage+"\nRegard Pay : $"+ regardPay + "\nOvertime Wage: $"+overtimeWage+ "\nOvertime Pay: $"+overtimePay+"\nTotal pay: $" + total);
}//end of if2
        else{
           System.out.println("Name: "+name+"\nHours: "+hours+"\nRegard Pay : $"+ wage + "\nTotal pay: $" +(hours*wage));
 

}//end of else
}//end of if1
}//end of do
              
   while(!name.equals("adios"));

          System.out.println("Goodbye!");

        

}//end of main    
}//end of class