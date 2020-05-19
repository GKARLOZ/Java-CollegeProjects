import java.util.Scanner;

  enum Color{
       Blue,Black,Red,Green,None;

}//end of enum 

public  abstract class Shape{

   private Color paint;
   private double length;

public Shape(){
  this.length = 1;
  this.paint = paint.Black;

}

public Shape(double l, String c){
  setShape(l,c);

}

public Shape(double l){
setLength(l);
setColor("Black");

}

public void setLength(double l){

   if (l >= 0.0){ length = l;}
   else 
      System.out.println("Length cant be a negative number");

}

public void setColor(String c){
   Color z = Color.Blue;
  do
    switch ( c ){
      case "Blue"   : z = paint.Blue;
      break;
      case "Black"  : z = paint.Black;
      break;
      case "Red"    : z = paint.Red;
      break;
      case "Green"  : z = paint.Green;
      break;
      default       : z = paint.None;
                System.out.println("Choose a color from the list [ Blue,Black,Red or Green]");
                Scanner in = new Scanner(System.in);
                String o = in.next();
                c= o;
      break;
}//end of switch
     while (z == paint.None);
             paint = z;
}//end of setColor

 public void setShape(double l, String c){
    setLength(l);
    setColor(c);
}

public double getLength(){
     return length;
}

public Color getColor(){
     return paint; 
}
@Override
public String toString(){

     return String.format("Length: %.2f  Color: %s",this.length,this.paint);
}

public abstract double  getArea();
public abstract double  getPerimeter();


}//end of class Shape









 





