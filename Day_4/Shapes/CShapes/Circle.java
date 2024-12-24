package CShapes;


 public class Circle extends Shape
 {
   private double radius;


    public Circle(double radius) {
      super(); 
      this.radius = radius;
  }

    @Override
    public void Draw() {
      System.out.println("Drawing a Circle with radius: " + radius);
     // throw new UnsupportedOperationException("Unimplemented method 'Draw'");
    } 


    
}







