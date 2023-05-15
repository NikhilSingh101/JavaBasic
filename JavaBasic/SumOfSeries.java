import java.util.Scanner;
public class SumOfSeries { // 1 - 2 + 3 - 4 + 5 - 6 + .....n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                ans = ans - i;
            }
            else{
                ans = ans + i;
            }
        }
        System.out.println("Answer:" + ans);
    }
}
