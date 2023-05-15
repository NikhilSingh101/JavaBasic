import java.util.Scanner;
public class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int ans = 0;
        while(num != 0){
            ans = ans * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Number of Digits:" + ans);
    }
}
