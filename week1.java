Week-1, Assignment-1

Complete the code segment to find the perimeter and area of a circle given a value of radius.

You should use Math.PI constant in your program. If radius is zero or less than zero then print " please enter non zero positive number ".

import java.util.Scanner;  
public class Exercise1_1 {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;
       
   //Calculate the perimeter 
  //Calculate the area
perimeter=2*Math.PI*radius;
area=Math.PI*radius*radius;
System.out.println(perimeter);
System.out.println(area);
 }
}
