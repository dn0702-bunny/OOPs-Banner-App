import java.util.Scanner;

public class level2 {
public class level2  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Question 1 -----");
        System.out.print("Enter number1: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter number2: ");
        double number2 = sc.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", "
                + multiplication + ", and " + division);


        System.out.println("\n----- Question 2 -----");
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();
@@ -44,4 +44,4 @@
        System.out.println("The length of the side is "
                + side + " whose perimeter is " + perimeter);
    }
}
}