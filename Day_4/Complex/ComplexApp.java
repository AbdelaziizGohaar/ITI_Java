public class ComplexApp {
    static class Complex<T extends Number>{
        T real, imag;
        public Complex(T real, T imag){
            this.real = real;
            this.imag = imag;
        }

        public Complex<Double> add(Complex<T> right){
            double real = this.real.doubleValue() + right.real.doubleValue();
            double img = this.imag.doubleValue() + right.imag.doubleValue();
            return new Complex<Double>(real, img);
        }

////////////////////////////////////////////////////////

     public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(real.toString()); 

        if (imag.doubleValue() > 0) {
            result.append("+").append(imag.toString()); 
        } else if (imag.doubleValue() < 0) {
            result.append(imag.toString()); 
        }
        return result.toString();
    }

    }


    public static void main(String[] args){
        System.out.println(
            new Complex<Integer>(25, 0)
        );
    }
}