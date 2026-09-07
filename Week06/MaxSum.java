package Week06;
import java.util.Scanner;
public class MaxSum {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long currentSum = sc.nextLong();
    long maxSum = currentSum;
    for(int i = 1;i < n; i++){
        long val = sc.nextLong();
        if(currentSum + val > val){
            currentSum = currentSum + val;
        } else {
            currentSum = val;
        }
        if(currentSum > maxSum) {
            maxSum = currentSum;
        }
    }
    System.out.println(maxSum);
    sc.close();
}
}
