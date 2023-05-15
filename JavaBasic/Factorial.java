import java.util.Scanner;
public class Factorial {

    static int fact(int num){
        int result;
        if(num == 1 || num == 0){
            return num;
        }
        // else
        result = num * fact(num - 1);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        // int fact = 1;
        // for(int i = 1; i <= num; i++)
        // fact = fact * i;
        // System.out.println("Factorial of a number:" + fact);

        System.out.print("Factorial of a number:" + fact(num));
    }
}
