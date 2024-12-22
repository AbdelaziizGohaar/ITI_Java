package convertcelisus;
import java.util.Scanner;
import java.util.function.Function;

 public class Test implements Function<Double,Double>{

    @Override
    public Double apply(Double Celsius) {
        Double formula =((Celsius *9)/5)+32;
        return formula;
    }
    

}
