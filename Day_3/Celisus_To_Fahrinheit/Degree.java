import java.util.Scanner;
import convertcelisus.*;

public class Degree
{

    public static void main(String[] args) 
    {
        Test t = new Test();
        System.out.println("Please enter a Celuisus Degree ");
        Scanner sc = new Scanner(System.in);
        double celuisesDegree = sc.nextDouble();
        System.out.println("Fehernhight : "+ t.apply(celuisesDegree));
    }

}