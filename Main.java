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
    // Made a constant that odd numbers = 1
    final int odd = 1;
    Scanner input = new Scanner(System.in);
    // Ask for an interger
    System.out.println("Please enter an integer:");
    int num = input.nextInt();
    // calculate the remainder
int even = num % 2;
// if statement that will tell you if its odd or not
     if (even >= odd){
      System.out.println(num + " is an odd number");
    } else {
      System.out.println(num + " is an even number");
    }



  }
}
