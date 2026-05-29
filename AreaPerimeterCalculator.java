import java.util.Scanner;

class AreaPerimeterCalculator {
 
   public static void main (String []args) {
       Scanner sc = new Scanner (System.in);

   System.out.println("Enter length: ");
float length = sc.nextFloat();

   System.out.println("Enter breath: ");
float breath = sc.nextFloat();

float area = (length * breath);

float perimeter = 2 * (length + breath);

  System.out.println("The area is: ");
  System.out.println(area);
 
  System.out.println("The perimeter is: ");
  System.out.println(perimeter);
  }
 
}
