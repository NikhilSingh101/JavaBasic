import java.util.Scanner;
import java.util.Arrays;
public class SmallestAndLargestEle {
        static int[] SmallestAndLargestElement(int arr[]){
            Arrays.sort(arr);
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i]);
                int []ans = {arr[0], arr[arr.length - 1]};
            }
            return ans;
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
        int []ans = SmallestAndLargestElement(arr);
        System.out.print("Smallest:"+ans[0]);
        System.out.print("Largest:"+ans[1]);
        
    }
}
