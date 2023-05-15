import java.util.Scanner;
public class IsSorted {
    static int isSorted(int arr[]){
        boolean check = true;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
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
        System.out.println("Is Sorted:"+isSorted(arr));
    }
}
