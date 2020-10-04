import java.util.Scanner;
/**
 *Positive integer to continue and negative integr to quit
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  //create Scanner
  Scanner input = new Scanner(System.in);
    //ask user for integer
  System.out.println("Please enter a positive integer to continue or a negative integer to quit");
   //declare a variable
  int integer = input.nextInt();
  do{ 
  System.out.println("Please enter a positive integer to continue or a negative integer to quit");
  integer = input.nextInt();
   }while(integer > 0);
   
   if(integer < 0){
   System.out.println("All Done");
   }else if (integer == 0){
    System.out.println("All Done");
   } 
  }

  }
