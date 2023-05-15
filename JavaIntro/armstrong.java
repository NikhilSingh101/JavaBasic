import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        // int count = 0;
        // while(temp>0){
        //     temp = temp / 10;
        //     count++;
        // }
        // System.out.print(count);
        // temp = n;
            while(temp>0){
            sum += (int)(Math.pow(temp%10,3));
            temp = temp / 10;
            // count--;
        }
        if(sum == n){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
   }
}
