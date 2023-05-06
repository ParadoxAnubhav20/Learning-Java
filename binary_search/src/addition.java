import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();
        float sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}