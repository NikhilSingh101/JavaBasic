// import java.io.*;
public class LeftArrayRotate {

    static void Rotate(int arr[], int d, int n){
        int temp[] = new int[n];

        int k = 0;

        // for(int i = d; i < n; i++){
        //     temp[k] = arr[i];
        //     k++;
        // }

        // for(int i = 0; i < d; i++){
        //     temp[k] = arr[i];
        //     k++;
        // }

        // for(int i = 0; i < n; i++){
        //     arr[i] = temp[i];
        // }

        //-----------------------------

        for(int i = d-1; i >= 0; i--){
            temp[k] = arr[i];
            k++;
        }

        for(int i = n-1; i >= d; i--){
            temp[k] = arr[i];
            k++;
        }

            int temp1;
            int start = 0;
            int end = n - 1;
            while(start < end){
                temp1 = temp[start];
                temp[start] = temp[end];
                temp[end] = temp1;
                start++;
                end--;
            }

            for(int i = 0; i < n; i++){
                System.out.print(temp[i] + " ");
                // System.out.println();
            }

        //---------------------------

        // int p = 1;
        // while(p <= d){
        //     int last = arr[0];
        //     for(int i = 0; i < n-1; i++){
        //         arr[i] = arr[i+1];
        //     }
        //     arr[n-1] = last;
        //     p++;
        // }

        //---------------------------
    }

    static void printArray(int arr[], int n){
        for(int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int d = 3;
        Rotate(arr, d, n);
        // printArray(arr, n);
    }

}
