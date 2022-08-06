package Pillers;

public class Inheritance {
    public static void main(String[] args) {

    }
}

  class Box{
    double l;
    private double k;
    double b;
    Box(){
        super();  // call the object call
        this.l=-1;
        this.b=-1;
    }
    Box(double side){
        this.l=side;
        this.b=side;
    }
    // copy constructor
    Box(Box old){
        this.l=old.l;
        this.b=old.b;
    }

      public Box(double l, double b) {
        this.l=l;
        this.b=b;
      }

      public void info(){
        System.out.println("run the box");
    }

}
