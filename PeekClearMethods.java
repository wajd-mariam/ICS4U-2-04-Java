/*
* Copyright (c) 2020
*
* The PopClearMethods program adds integer to the stack, pop numbers off stack, 
* returns the top number of stack without popping it, and clears the stack.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/11
*/

// Imports Java Classes:
import java.util.Scanner;


class PeekClearMethods {
  public static void main(String[] args) {

    // Declaring the stackArray using WajdStack Class
    WajdStack3 stackArray = new WajdStack3();

    // Entering a while true loop:
    while (true) {
      
      // Declaring variables used:
      int sizeStack = 0;
      int intAdded = 0;
      int counter = 0;
      int popNumber = 0;
      int counter2 = 0;
      
  
      // Try Catch Statement for catching input error:
      try {
      
        // Input / Process / Output
      
        // Getting size of the stack:
        Scanner input1 = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter the size of the stack: ");
        sizeStack = input1.nextInt();
      
        // Checking if entered size is valid:
        if (sizeStack == 0) {
          System.out.println("You can't have a stack size 0!");
          break;
        } else { 
          // Entering a do/while loop add integers into the stack list:
          do {
            // Getting an integer from the user:
            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter a number to add to the stack: ");
            intAdded = input2.nextInt();
            // Adding one to counter each time:
            counter = counter + 1;
            // Pushing the integer inputted  to the stack:
            stackArray.push(intAdded);
          } while (counter != sizeStack); 
          
          // Asking users what they  want to do with the stack.
          // Pop, or Peek top value, or clear stack:
          Scanner input3 = new Scanner(System.in);
          System.out.println("");
          System.out.println("What do you want to do with the stack?");
          System.out.println("Do you want to pop off top value? Get the top value or clear stack?");
          System.out.println("Valid entries are 'pop', 'peek', 'clear' ");
          final String userDecision = input3.nextLine(); 
          
          // User decided to peek top value:
          if (userDecision.equals("peek")) {
            System.out.print("The top number is " + stackArray.peek());
            System.out.println("");
            
          // User decided to pop off numbers from stack:
          } else if (userDecision.equals("pop")) {
            Scanner input4 = new Scanner(System.in);
            System.out.print("How many times do you want to pop integers off stack?  ");
            popNumber = input4.nextInt(); 
            // Try Catch Statement for catching if stack is empty:
            try {
              // Entering a do/while loop to pop off numbers from stack:
              do {
                // Popping off the first element in the stack and printing to user:
                System.out.println("");
                System.out.println("The popped number is " + stackArray.pop());
                // Printing array list stack the user created:
                System.out.println("");
                System.out.println("The stack after popping off the current top integer: ");
                System.out.println(stackArray.list());
                // Adding one to counter2 each time:
                counter2 = counter2 + 1;
              } while (counter2 != popNumber);
              // Error catch null value passed:
            } catch (NullPointerException e) {
              System.out.println("");
              System.out.print("ERROR. Stack is empty!");
            }
            // User decided to clear stack: 
          } else if (userDecision.equals("clear")) {
            stackArray.clear();
            System.out.println(stackArray.list());
            System.out.println("The stack is cleared!");
            System.out.println("");
          }
        }
      // Error Catch Statement:
      } catch (Exception e) {
        System.out.print("");
        System.out.println("ERROR."); 
      }
    }
  }
}