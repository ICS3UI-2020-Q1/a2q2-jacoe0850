import java.util.Scanner;
/**
 * Determines if a given number is odd or even
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // asking for the two integers
    Scanner input = new Scanner(System.in);
   System.out.println("Please enter an integer");
    int num = input.nextInt();
    System.out.println("Please enter another integer");
    int num2 = input.nextInt();
    // if statement that says which one is bigger
    if (num > num2){
      System.out.println("The biggest number is " + num);
    } else {
      System.out.println("The biggest number is " + num2);
    }
    
  }
}
