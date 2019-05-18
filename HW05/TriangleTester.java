/*
*Name: Ellie Parobek
*Course ISTE-120-04-17
*HW: #05
*TriangleTester class used to test the Triangle class by entered inputs..
*/
import javax.swing.*;
   public class TriangleTester{
      public static void main(String args[]){
         //Set up the JFrame for getting x and y inputs.
         JFrame frame = new JFrame();
         //Create new triangle t.
         Triangle t = new Triangle();
         //Get inputs for the first point A.
         double x1 = Double.parseDouble(JOptionPane.showInputDialog(frame, "Enter x1 for point A"));
         double y1 = Double.parseDouble(JOptionPane.showInputDialog(frame, "Enter y1 for point A"));
         //Set point A from inputs.
         t.setPointA(x1, y1);
         //Get inputs for the second point B.
         double x2 = Double.parseDouble(JOptionPane.showInputDialog(frame, "Enter x2 for point B"));
         double y2 = Double.parseDouble(JOptionPane.showInputDialog(frame, "Enter y2 for point B"));
         //Set point B from inputs.
         t.setPointB(x2, y2);
         //Get inputs for the third point C.
         double x3 = Double.parseDouble(JOptionPane.showInputDialog(frame, "Enter x3 for point C"));
         double y3 = Double.parseDouble(JOptionPane.showInputDialog(frame, "Enter y3 for point C"));
         //Set point C from inputs.
         t.setPointC(x3, y3);
         //Print all information from Triangle t.
         System.out.println("Set up triangle with coordinates (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), (" + x3 + ", " + y3 + ")");
         System.out.println("Area: " + (Math.round(t.calcArea() * 100.0) / 100.0));
         System.out.println("Perimeter: " + (Math.round(t.calcPerimeter() * 100.0) / 100.0));
         System.out.println("Length side a: " + (Math.round(t.lengthA() * 100.0) / 100.0));
         System.out.println("Length side b: " + (Math.round(t.lengthB() * 100.0) / 100.0));
         System.out.println("Length side c: " + (Math.round(t.lengthC() * 100.0) / 100.0));
         System.out.println("Height h: " + (Math.round(t.getHeight() * 100.0) / 100.0));
         System.out.println("Angle A: " + (Math.round(t.angleA() * 100.0) / 100.0));
         System.out.println("Angle B: " + (Math.round(t.angleB() * 100.0) / 100.0));
         System.out.println("Angle C: " + (Math.round(t.angleC() * 100.0) / 100.0));
         //Exit the run.
         System.exit(0);
      }
   }