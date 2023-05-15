public class SecondMax {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(secMax < arr[i] && arr[i] != max){
                secMax = arr[i];
            }
        }

        System.out.println("The second max ele is " + secMax);
    }
}
