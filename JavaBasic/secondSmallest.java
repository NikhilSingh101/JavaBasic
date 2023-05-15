import java.util.Scanner;

public class secondSmallest {
    static int findMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    static int findSecondMin(int arr[]){
        int min = findMin(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int secondMin = findMin(arr);
        return secondMin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of array:");
        // int n = sc.nextInt();
        int arr[] = new int[5];
        int n = arr.length;
        System.out.println("Enter " + n + " elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Second Minimum Element:"+findSecondMin(arr));
    }
}
