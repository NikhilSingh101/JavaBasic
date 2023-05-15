import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int digits = 0;
        while(num != 0){
            num = num / 10;
            digits++;
        }
        System.out.println("Number of Digits:" + digits);
    }
}
