// Write a Java program that reads an integer from the user and divides 100 by the entered number.
// Implement exception handling to manage scenarios where the user enters zero (which causes a division by zero) and when the user inputs a non-integer value.


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter an Integer: ");
            int number = scanner.nextInt();

            int result  = 100 / number;
            System.out.println("Result: 100 / " + number + " = " + result);
        }

        catch (ArithmeticException e){
            System.out.println("Error : Division by Zero is not allowed");
        }
        catch (InputMismatchException e) {
            System.out.println("Error : Please enter a valid integer");
        }
        finally {
            scanner.close();
        }
    }
}
