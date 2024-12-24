//import java.util.Scanner;
import azizexception.*;

public class Main {
    public static void main(String[] args) {
        Checkers ss = new Checkers();
        try 
        {
            ss.checkForNull("aziz"); 
            ss.checkForEmptyString("zezo"); 
            ss.divideNumbers(10, 0); 

        } catch (azizexception e) {
            System.out.println("caught aziz exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("caught Arithmetic Exception: " + e.getMessage());
         }catch (NullPointerException e) {
            System.out.println("caught NullPointer Exception: " + e.getMessage());
        }
        
    }
}
