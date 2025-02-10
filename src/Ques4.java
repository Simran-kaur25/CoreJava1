// Create an interface Shape with a method draw(). Implement this interface in two classes, Circle and Rectangle, each providing its own implementation of the draw() method.
// Demonstrate polymorphism by calling the draw() method on instances of both classes.


public class Ques4 {
    interface Shape{
    void draw();
    }

public static class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a cicrle");
    }
}

public static class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
}
    public static void main(String args[]){
        Shape shape1= new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw();
        shape2.draw();

    }
}
