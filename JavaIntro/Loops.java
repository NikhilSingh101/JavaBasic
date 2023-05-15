import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        // for(int i = 0; i < 10; i++){
        //     System.out.println("Hello");

            // int i = 0;
            // while(i < 10){
            //     System.out.println("Hii");
            //     i++;
            // }

            // do{
            //     System.out.println("Hello");
            //     i++;
            // }while(i < 10);

            // for(int i = 1; i <= 5; i++){
            //     for(int j = 1; j <= i; j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }

            // for(int i = 1; i <= 5; i++){
            //     for(int j = 1; j <= i; j++){
            //         System.out.print(j + " ");
            //     }
            //     System.out.println();
            // }

            // int count = 1;
            // for(int i = 1; i <= 5; i++){
            //             for(int sp = 5; sp >=i; sp--){
            //                 System.out.print(" ");
            //             }
            //         for(int j = 1; j <= i; j++){
            //           System.out.print(count + " ");
            //           count++;
            //     }
            //     System.out.println();
            // }

            // for(int i = 1; i <= 5; i++){
            //     for(int j = 5; j >= i; j--){
            //         System.out.print("  ");
            //     }
            //     for(int k = 1; k <= i; k++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }

            // for(int i = 5; i >= 1; i--){
            //     for(int sp = 5; sp >= i; sp--){
            //         System.out.print(" ");
            //     }
            //     for(int j = 1; j <= i; j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }

            // int n = 5;
            // for(int i = 1; i <= n; i++){
            //     for(int sp = 1; sp <= n-i; sp++){
            //         System.out.print("  ");
            //     }
            //     for(int j = 1; j <= i; j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }

                // for(int i = 1; i <=5; i++){
                //     for(int sp = 5; sp >= i; sp--){
                //         System.out.print("  ");
                //     }
                //     for(int j = 1; j <= 2 * i - 1; j++){
                //         System.out.print("* ");
                //     }
                //     System.out.println();
                // }
                // for(int i = 4; i >= 1; i--){
                //     for(int sp = 5; sp >= i; sp--){
                //         System.out.print("  ");
                //     }
                //     for(int j = 1; j <= 2 * i - 1; j++){
                //         System.out.print("* ");
                //     }
                //     System.out.println();
                // }

                // for(int i = 1; i <= 5; i++){
                //     for(int j = 5; j >= i; j--){
                //         System.out.print(j + " ");
                //     }
                //     System.out.println();
                // }

                // Scanner sc = new Scanner(System.in);
                // System.out.print("Enter the value of n : ");
                // int n = sc.nextInt();

                // for(int i = 1; i <= n; i++){
                //     for(int j = 1; j <= i; j++){
                //         System.out.print("* ");
                //     }
                //     System.out.println();
                // }

                // Scanner sc = new Scanner(System.in);
                // System.out.print("Enter the value of n : ");
                // int n = sc.nextInt();

                // for(int i = 1; i <= n; i++){
                //     for(int sp = n;sp >= i; sp--)
                //     System.out.print("  ");
                //     for(int j = 1; j <= i; j++){
                //         System.out.print("* ");
                //     }
                //     System.out.println();
                // }

                // Scanner sc = new Scanner(System.in);
                // System.out.print("Enter the value of n : ");
                // int n = sc.nextInt();
                // for(int i = 1; i <= n; i++){
                //     for(int sp = n; sp>=i; sp--)
                //     System.out.print("  ");
                //     for(int j = 1; j <= 2*i-1; j++){
                //         System.out.print("* ");
                //     }
                //     System.out.println();
                // }

                // Scanner sc = new Scanner(System.in);
                // System.out.print("Enter the value of n : ");
                // int n = sc.nextInt();

                // for(int i = 1; i <= n; i++){
                //     for(int sp = n; sp>=i; sp--)
                //     System.out.print("  ");
                //     for(int j = 1; j <= 2*i-1; j++){
                //         System.out.print("* ");
                //     }
                //     System.out.println();
                // }

                // for(int i = n-1; i >= 1; i--){
                //     for(int sp = n; sp>=i; sp--)
                //     System.out.print("  ");
                //     for(int j = 1; j <= 2*i-1; j++){
                //         System.out.print("* ");
                //     }
                //     System.out.println();
                // }

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the value of n : ");
                int n = sc.nextInt();
                for(int i = 1; i <= n; i++){

                    for(int j = 1; j <= n; j++){
                        if(i==1 || i==n || j==1 || j==n || i==j || i+j==n+1){
                        System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }

            //    Scanner sc = new Scanner(System.in);
            //    System.out.println("Enter the size of array:");
            //    int n = sc.nextInt();
            //    int[] arr = new int[n];
            //    for(int i = 0; i < n; i++){
            //     arr[i] = sc.nextInt();
            //    }
            //    System.out.println("Enter the target:");
            //    int target = sc.nextInt();

            //    int start = 0;
            //    int end = arr.length - 1;

            //    while(start < end){
            //     int mid = (start + end) / 2;
            //     if(target == mid){
            //       // System.out.print("Target Element present at mid");
            //     }
            //     else if(target < mid){
            //         // System.out.print("Target Element present before mid");
            //         end = mid - 1;
            //     }
            //     else if(target > mid){
            //         // System.out.print("Target Element present after mid");
            //         start = mid + 1;
            //     }
            //     else{
            //         System.out.print("Target Element is not present");
            //     }
            // }
//---------------------------------------------------------------------------
            //  Scanner sc = new Scanner(System.in);
            //     System.out.print("Enter the value of n : ");
            //     int n = sc.nextInt();
            //     for(int i = 1; i <= n; i++){
            //         for(int sp = n; sp >= i; sp--)
            //         System.out.print("  ");

            //         for(int j = 1; j <= i; j++){
            //             System.out.print("*  ");
            //         }
            //         System.out.println();
            //     }
                 
        }
    }


