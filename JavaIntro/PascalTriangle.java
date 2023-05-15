// import java.io.*;
import java.util.Scanner;
public class PascalTriangle {

    static int fact(int n){
        int factorial = 1;
        for(int i = 2; i <= n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
    //      Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the no. of rows:");
    //     int n = sc.nextInt();
    //     int coeff = 1;
    //     for(int i = 0; i < n; i++){
    //         for(int sp = 1; sp < n - i; sp++)
    //         System.out.print(" ");
    //         for(int j = 0; j <= i; j++){
    //             if(i == 0 || j == 0){
    //                 // c = 1;
    //                 System.out.print(1 + " ");
    //             }
    //             else{
    //                 coeff = coeff * (i - j + 1) / j;
    //                 System.out.print(coeff + " ");
    //             }
    //         }
    //         System.out.println();
    //     }

        // --- OR ---

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int sp = 0; sp <= n - i - 1; sp++)
            System.out.print(" ");
            for(int j = 1; j <= i; j++){
                if(i == 1 || j == 1){
                    System.out.print(1 + " ");
                }
                else
                System.out.print(fact(i) / (fact(j) * fact(i - j)) + " ");
            }
            System.out.println();
        }
    }
}
