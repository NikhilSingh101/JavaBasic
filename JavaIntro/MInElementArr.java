import java.util.Scanner;
public class MInElementArr {
    static int maxEle(int arr[], int n){
        int min = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5, 8, 1, 3 , 4};
        int n = arr.length;
        System.out.print("The min element is " + maxEle(arr, n));
    }
}

