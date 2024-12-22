import java.util.Scanner;
import java.util.function.Function;

import Equations.Test;

public class Root {
    
 public static void main(String[] args) {
 
    double arr[] = new double[3] ;

    System.out.println(" Enter A, B , c ");
    Scanner sc = new Scanner(System.in);

    for(int i = 0; i<3;i++)
    {
      arr[i] = sc.nextDouble();
    }

 
    Test rr= new Test();
    rr.apply(arr);
    sc.close();
 }/// main ending  


}
