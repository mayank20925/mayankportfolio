package Introduction;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum is  : " + sum);
        int sub = a-b;
        System.out.println("Subtraction is : " + sub);
        int multi = a*b;
        System.out.println("Multiplication is : " + multi);
        int div = a/b;
        System.out.println("Division is : " + div);
        int mod = a%b;
        System.out.println("Modulus is : " + mod);

    }
}
