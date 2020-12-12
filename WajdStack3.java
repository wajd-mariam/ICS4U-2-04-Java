/*
* Copyright (c) 2020
*
* The WajdStack1 Class creates a stack to use 
* by the TryCatchPop.java program, and has different methods to process.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/09
*/

import java.util.ArrayList; // import the ArrayList class

public class WajdStack3 {
  
  // Creating and Array List:
  private ArrayList<Integer> stackArray = new ArrayList<Integer>();

  
  /**
   * This method add the integer inputted and 
   * returns the Integer that has been added to the stack.
   */
  public void push(int add) {
    stackArray.add(add);
  }
  
  /**
   * This method pops the top number off the stack and returns it.
   */
  public Integer pop() {
    if (this.stackArray.size() < 1) {
      throw null;
    } else {
      int poppedNumber = this.stackArray.get(stackArray.size() - 1);
      stackArray.remove(stackArray.size() - 1);
      return poppedNumber;
    }
  }
  
  /**
   * Returns  top value.
   */
  public Integer peek() {
    int topNumber = this.stackArray.get(stackArray.size() - 1);
    return topNumber; 
  }  
  
  /**
   * This is a valid java doc.
   */
  public void clear() {
    stackArray.clear();
  }
  
  /**
   * This is a valid java doc.
   */ 
  public String list() {
    String currentCharacters = "";
    for (int character = 0; character < stackArray.size(); character++) {
      currentCharacters = currentCharacters + stackArray.get(character) + ", ";
    } 
    return currentCharacters;
  }
}
