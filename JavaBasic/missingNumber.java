// import java.util.Scanner;

public class missingNumber{
    static int missingnumber(int arr[]) {
        int ans = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i]+1 != arr[i+1]){
               ans = arr[i+1];
            }
            else{
                ans = -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5};
        System.out.print(missingnumber(arr));
    }
}