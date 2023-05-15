import java.util.Scanner;
public class ArrayDemo {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = {1, 2, 3, 4, 5};
        // int[] arr = {1, 2, 3, 4, 5};
        int dy[] = new int[6];

        System.out.print("Enter the ele of array:");
        for(int i = 0; i < dy.length; i++){
           dy[i] = sc.nextInt();
        }

        System.out.println("The ele of array:");
        for(int i = 0; i < dy.length; i++){
            System.out.print(dy[i] + " ");
        }

     }
}
