import java.util.Scanner;
public class StrictlyGreater {
    static int strictlyGreater(int []arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter " + n + " elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter x:");
        int x = sc.nextInt();
        System.out.println("No. of elements strictly greater than "+ x + " is " +strictlyGreater(arr, x));
    }
}
