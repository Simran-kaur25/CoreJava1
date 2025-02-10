// Explain the difference between method overloading and method overriding in Java. Provide code examples to illustrate both concepts.


// Method Overloading                                                         Method Overriding
//        Defining multiple methods with the same name but            Defining a method in the child class that has the same name, return type,
//        different parameters in the same class.                     and parameters as a method in the parent class.

//        Within the same class.                                        Between parent and child classes (Inheritance).

//        Compile-time polymorphism (early binding).                    Runtime polymorphism (late binding).

//        No special keyword is needed.                                 @Override annotation is recommended.

//        Parameters must be different                                  Parameters must be exactly the same as in the parent class.




// Method Overloading

public class Ques3a {
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

    double add (double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Ques3a obj = new Ques3a();
        System.out.println("Sum of 2 numbers is " + obj.add(10, 20));
        System.out.println("Sum of 3 numbers is " + obj.add(10, 20, 30));
        System.out.println("Sum of doubles is " + obj.add(1.8, 9.3));
    }
}
