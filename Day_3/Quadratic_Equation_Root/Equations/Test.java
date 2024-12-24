package Equations;
import java.util.Scanner;
import java.util.function.*;
import java.util.function.Function;


public class Test implements Function<double[],Double[]> {

    @Override
    public Double[] apply(double[] arr) {
        double equetion = Math.pow(arr[1], 2) - 4 * arr[0] * arr[2];  //b^2 - a * a *c
            if (isNegative(equetion)) {
                System.out.println("The equation has no real roots (negative)");
                return null;
            }
            double sqrt = Math.sqrt(equetion);
            double root1 = (-arr[1] + sqrt) / (2 * arr[0]); 
            double root2 = (-arr[1] - sqrt) / (2 * arr[0]); 

        return new Double[]{root1, root2};
    }


    private boolean isNegative(double x){
         return x<0;
    }
        

}












