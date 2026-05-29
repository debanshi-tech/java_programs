import java.util.Scanner;

class PercentageCalculator {
  public static void main (String []args) {
    Scanner per = new Scanner (System.in);
      System.out.println("Enter obtained marks: ");
    float num = per.nextFloat();
      System.out.println("Enter total marks: ");
    float total = per.nextFloat();
    float percentage = (num/total)*100;
    System.out.println("Your percentage is: ");
    System.out.println(percentage);
  }
}
