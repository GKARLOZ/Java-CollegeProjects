import java.util.Scanner;



public class ShapeInhereitanceTest{

public static void main(String [] args){
    Scanner in = new Scanner(System.in);



   Circle circle1 = new Circle (5);
   System.out.println("Circle with radius 5 : \n"+ circle1);


   System.out.printf("\nEnter radius: \n");
    double r = in.nextDouble();
    Circle circle2 = new Circle(r);
    System.out.println(circle2+"\n");


    Rectangle rectangle1 = new Rectangle(4,2);
    System.out.println("Rectangle with length: 4 and width:2\n"+rectangle1);

    System.out.printf("\nEnter length:");
    double l = in.nextDouble();
 
    System.out.printf("\nEnter a width:");
    double w = in.nextDouble();
    Rectangle rectangle2 = new Rectangle(l,w);
    System.out.println(rectangle2);
    

}//end of main 
}//end of class 