import java.util.Scanner;
public class MaxElementArr {
    static int maxEle(int arr[], int n){
        int max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5, 8, 1, 3 , 4};
        int n = arr.length;
        System.out.print("The max element is " + maxEle(arr, n));
    }
}
