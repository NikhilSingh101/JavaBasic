import java.util.Scanner;
public class ptn1 {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of rows:");
        // int n = sc.nextInt();
        // for(int i = 1; i <=n; i++){
        //     for(int j = 1; j <=i; j++){
        //         if((i + j) % 2 == 0){
        //             System.out.print("1 ");
        //         }
        //         else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

        //_______________________________________

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of rows:");
        // int n = sc.nextInt();
        // for(int i = 1; i <=n; i++){
        //     for(int j = 1; j <=n; j++){
        //         if((i + j) % 2 == 0){
        //             System.out.print("1 ");
        //         }
        //         else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // } 

        //_______________________________________

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the no. of rows:");
        // int n = sc.nextInt();
        // for(int i = 1; i <= n; i++){
        //     for(int sp = n - 1; sp >= i; sp--)
        //     System.out.print(" ");
        //     for(int j = i; j >= 1; j--){
        //         System.out.print(j);
        //     }
        //     for(int k = 2; k <= i; k++){
        //         System.out.print(k);
        //     }
        //     System.out.println();
        // }

        //_______________________________________

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the no. of rows:");
        // int n = sc.nextInt();
        // for(int i = 1; i <= 2 * n - 1; i++){
        //     for(int j = 1; j <= 2*n-1; j++){
        //         if(j==1 || j==2*n-1 || i==1 || i==2*n-1){
        //             System.out.print(n);
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //_______________________________________

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the no. of rows:");
        // int n = sc.nextInt();
        // int start = 0;
        // int len = 2 * n - 1;
        // int end = len - 1;
        // int a[][] = new int[len][len];
        // while(n != 0){
        //     for(int i = start; i <=end; i++){
        //         for(int j = start; j <= end; j++){
        //             if(i == start || i == end || j == start || j == end){
        //                 a[i][j] = n;
        //             }
        //         }
        //     }
        //     ++start;
        //     --end;
        //     --n;
        // }
        // for(int i = 0; i < len; i++){
        //     for(int j = 0; j < len; j++){
        //         System.out.print(a[i][j]);
        //     }
        //     System.out.println();
        // }

        //____________________________________________

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--){
            for(int j = n; j >= i; j--)
            System.out.print(j);
            for(int k = 1; k <= i; k++){
                System.out.print(k);;
            }
            System.out.println();
        }
    }
}
