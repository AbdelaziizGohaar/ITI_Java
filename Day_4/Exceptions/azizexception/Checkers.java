package azizexception;
import java.util.Scanner;


public class Checkers
{
 public void checkForNull(String input) throws NullPointerException 
 {
    if (input == null) 
    {
        throw new NullPointerException("Error: Input is null.");
    }
    System.out.println("Input is valid: " + input);
 }

 ///////////////////////////////////////////////////////////////////////////////////////////

 public int divideNumbers(int a, int b) throws ArithmeticException 
 {
    if (b == 0) 
    {
        throw new ArithmeticException("Division by zero is not allowed.");
    }
    return a / b;
 }

 ///////////////////////////////////////////////////////////////////////////////////////
 public String checkForEmptyString(String input) throws azizexception 
 {
    if (input.isEmpty()) 
    {
        throw new azizexception("Input string is empty.");
    }
    return input;
 }

 //////////////////////////////////////////////////////////////////////////////////

}
