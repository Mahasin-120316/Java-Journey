package Week06;

import java.util.Scanner;
public class MaximumWindow {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] arr = new long[n];
    for(int i = 0;i < n; i++){
        arr[i] = sc.nextLong();
    }
    int k = sc.nextInt();
    long currentSum = 0;
    for(int i = 0;i < k; i++){
        currentSum += arr[i];
    }
    long maxSum = currentSum;
    for(int i = k;i < n; i++){
        currentSum += arr[i] - arr[i - k];
        if(currentSum > maxSum) {
            maxSum = currentSum;
        }
    }
    System.out.println(maxSum);
    sc.close();
}
}
