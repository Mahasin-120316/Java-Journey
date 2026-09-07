package Week06;
import java.util.Scanner;
public class TargetSum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextLong();
        }
        long target = sc.nextInt();
        int left = 0;
        int currentSum = 0;
        for(int right = 0;right < n;right++){
            currentSum += arr[right];
            while(currentSum > target && left < right){
                currentSum -= arr[left];
                left++;
            }
            if(currentSum == target){
                System.out.println(left + " " + right);
                sc.close();
                return;
            }
        }
        System.out.println(-1);
        sc.close();
    }
}
