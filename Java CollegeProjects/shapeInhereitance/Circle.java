public class Circle extends Shape{// subclass


private  double circumference;
private  double radius; 

public Circle (){
   super(2);
}

public Circle(double r){
   setLength(r);
}
@Override 
public double getArea(){
  double area = 3.14 * (super.getLength() * super.getLength());
  return area;
}

@Override
public double getPerimeter( ){
    double total = 2*(3.14)*super.getLength() * super.getLength(); 
    return total;
}
@Override
public String toString(){
  return String.format("Area: %.2f Circumference: %.2f \n"+ super.toString(),getArea(),getPerimeter());

}

}//end of circle