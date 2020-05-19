public class Rectangle extends Shape{// subclass


private  double width; 

public Rectangle (){
   super(2);
   this.width     = 1.0;
}

public Rectangle(double l, double w ){
   super(l);
   this.width = w;
}

@Override 
public double getArea(){
  double area = (super.getLength() * this.width);
  return area;
}
@Override 
public double getPerimeter( ){
  double total = 2*(this.width + super.getLength()); 
  return total;
  }

@Override
public String toString(){
  return String.format("Area: %.2f Perimeter: %.2f \n" + super.toString(),getArea(),getPerimeter());

}

}//end of circle