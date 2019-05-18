/*
*Name: Ellie Parobek
*Course ISTE-120-04-17
*HW: #05
*Triangle class to do triangle calculations using x and y coordinates of its three corner points.
*/  
   public class Triangle{
      private double x1, y1, x2, y2, x3, y3, x4, y4;
      //Set point A from input.
      public void setPointA(double x1a, double y1a){
         x1 = x1a;
         y1 = y1a;
      }
      //Set point B from input.
      public void setPointB(double x2b, double y2b){
        x2 = x2b;
        y2 = y2b;
      }
      //Set point C from input.
      public void setPointC(double x3c, double y3c){
         x3 = x3c;
         y3 = y3c;
      }
      //Get length a from the distance of C to B.
      public double lengthA(){
         double lengthA = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
         return lengthA;
      } 
      //Get length b from the distance of C to A.
      public double lengthB(){
         double lengthB = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
         return lengthB;
      }
      //Get length c from the distance of B to A.
      public double lengthC(){
         double lengthC = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
         return lengthC;
      }
      //Get D from the x of C and the y of A. Get height from the distance of D to C.
      public double getHeight(){
         x4 = x3;
         y4 = y1;
         double height = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
         return height; 
      }
      //Get angle A from the arcsin of h/b
      public double angleA(){
         double angleA = Math.asin(getHeight() / lengthB());
         angleA = Math.toDegrees(angleA);
         return angleA;
      }
      //Get angle B from the arcsin of h/a
      public double angleB(){
         double angleB = Math.asin(getHeight() / lengthA());
         angleB = Math.toDegrees(angleB);
         return angleB;
      }
      //Get angle C from the leftover angle 180 - A - B
      public double angleC(){
         double angleC = (180 - angleA() - angleB());
         return angleC;
      }
      //Get perimeter from all of the lengths added together.
      public double calcPerimeter(){
         double perimeter = lengthA() + lengthB() + lengthC();
         return perimeter; 
      }
      //Get area from formula base(c) * height / 2
      public double calcArea(){
         double area = ((getHeight() * lengthC()) / 2);
         return area;      
      }
  }
  