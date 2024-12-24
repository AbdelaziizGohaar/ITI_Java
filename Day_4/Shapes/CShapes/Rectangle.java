package CShapes;

 public class Rectangle extends Shape  
 {
  private double length;
  private double width;


  public Rectangle(double length, double width) {
      super(); 
      this.length = length;
      this.width = width;
  }

    @Override
    public void Draw() {

      System.out.println("Drawing a Rectangle with length: " + length + " and width: " + width);
     //  throw new UnsupportedOperationException("Unimplemented method 'Draw'");
    } 

}







