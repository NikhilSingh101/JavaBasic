import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();

        System.out.print("Enter the choice:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int sum = a + b;
                System.out.println("The sum is "+sum);
                break;
            case 2:
                int sub = a - b;
                System.out.println("The Subtraction is "+sub);
                break;
            case 3:
                int mul = a * b;
                System.out.println("The multiplication is "+mul);
                break;
            case 4:
                int div = a / b;
                System.out.println("The division is "+div);
                break;
            case 5:
                int rem = a % b;
                System.out.println("The remainder is "+rem);
                break;
            default:
                System.out.println("You have entered wrong choice");
                break;
        }
    }
}
