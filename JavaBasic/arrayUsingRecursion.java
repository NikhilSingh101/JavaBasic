import java.util.Scanner;
public class arrayUsingRecursion {
    
    static void printArray(int []arr, int idx){
        // Base Case
        if(idx == arr.length){
            return;
        }
        System.out.print(arr[idx] + " ");
        printArray(arr, idx+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter the elements of array:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr, 0);
    }
}
