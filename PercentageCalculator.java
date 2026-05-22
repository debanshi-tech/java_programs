import java.util.Scanner;
class PercentageCalculator {
  public static void main (String []args) {
    Scanner per = new Scanner (System.in);
      System.out.println("Enter num: ");
    float num = per.nextFloat();
    float percentage = (num/100)*100;
    System.out.println("Your perentage out of 100 is: ");
    System.out.println(percentage);
  }
}
    
