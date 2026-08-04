import java.util.Scanner;
public class QuizApplication{
  public static void main(String []args){
    Scanner sc = new Scanner (System.in);

    System.out.println("1. Start Quiz");
    System.out.println("2. Exit Game");

    System.out.print("Enter your choice: ");

    int userInput = sc.nextInt();

    if(userInput==1){
      int score = 0;
      System.out.println("Starting Quiz...");

        System.out.println("Question 1");
          System.out.println("Which keyword is used to create an object in Java?");
        
           System.out.println("A. class");
          System.out.println("B. new");
          System.out.println("C. static");
          System.out.println("D. public");
          
        System.out.print("Enter your answer: ");
        char choice = sc.next().charAt(0);

        if(choice=='b' || choice=='B'){
            System.out.println("Right Answer!!");
            score++;
        }
        else {
            System.out.println("Wrong Answer!!");
        }

        
        System.out.print("Type next to continue: ");
        String ans = sc.next();

        if(ans.equalsIgnoreCase("next")){
        System.out.println("Question 2");
          System.out.println("Which method is the entry point of every Java program?");

          System.out.println("A. start()");
          System.out.println("B. run()");
          System.out.println("C. main()");
          System.out.println("D. execute()");
          System.out.print("Enter your answer: ");
          choice = sc.next().charAt(0);

          if(choice=='c' || choice=='C'){
            System.out.println("Right Answer!!");
            score++;
        }
        else {
            System.out.println("Wrong Answer!!");
        }
      }

      else{
        System.out.println("Invalid Input!!");
        return;
      }

      System.out.print("Type next to continue: ");
      ans = sc.next();
      if(ans.equalsIgnoreCase("next")){
        System.out.println("Question 3");
          System.out.println("Which class is used to take input from the user in Java?");

          System.out.println("A. Reader");
          System.out.println("B. Console");
          System.out.println("C. Scanner");
          System.out.println("D. Input");
          System.out.print("Enter your answer: ");
          choice = sc.next().charAt(0);

          if(choice=='c' || choice=='C'){
            System.out.println("Right Answer!!");
            score++;
        }
        else {
            System.out.println("Wrong Answer!!");
        }
      }
      else{
        System.out.println("Invalid Input!!");
        return;
      }

      System.out.print("Type next to continue: ");
      ans = sc.next();
      if(ans.equalsIgnoreCase("next")){
        System.out.println("Question 4");
          System.out.println("Which data type is used to store a single character?");

          System.out.println("A. String");
          System.out.println("B. char");
          System.out.println("C. int");
          System.out.println("D. boolean");
          System.out.print("Enter your answer: ");
          choice = sc.next().charAt(0);

          if(choice=='b' || choice=='B'){
            System.out.println("Right Answer!!");
            score++;
        }
        else {
            System.out.println("Wrong Answer!!");
        }
      }
      else{
        System.out.println("Invalid Input!!");
        return;
      }

      System.out.print("Type next to continue: ");
      ans = sc.next();
      if(ans.equalsIgnoreCase("next")){
        System.out.println("Question 5");
          System.out.println("Which loop is guaranteed to execute at least once?");

          System.out.println("A. for");
          System.out.println("B. while");
          System.out.println("C. do-while");
          System.out.println("D. foreach");
          System.out.print("Enter your answer: ");
          choice = sc.next().charAt(0);

          if(choice=='c' || choice=='C'){
            System.out.println("Right Answer!!");
            score++;
        }
        else {
            System.out.println("Wrong Answer!!");
        }
      }
      else{
        System.out.println("Invalid Input!!");
        return;
      }

        System.out.println("==================");
        System.out.println("Quiz Completed!!");
        System.out.println("==================");
        System.out.println("Your final score: " + score + "/5");
    }

    else if(userInput==2){
      System.out.println("Thank you for playing!");
    }

    else
      System.out.println("Invalid Input");
  }
}
