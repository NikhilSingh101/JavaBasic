import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(i=2;i<=n;i++){
           if(n%i == 0)
           break;
        }
        if(i == n){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
