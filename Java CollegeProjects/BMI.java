// CIS 183
// Lab Assigment 02  
// Giancarlo Bustos
import java.util.Scanner;

public class BMI {
public static void main(String args[]){

Scanner input = new Scanner(System.in);
  double height,weight,bmi;

System.out.print("Enter height in meters\n");
 height = input.nextDouble();

System.out.print ("Enter weight in kilograms\n");
 weight = input.nextDouble();

bmi = weight/(height*height);

System.out.print("Your BMI is " + bmi + "\n\nBMI Categories\nUnderweight = <18.5\nNormal weight = 18.5 to 24.9\nOverweight = 25 to 29.9\nObesity = BMI of 30 or greater");





}// end of main
}// end of class