package Week06;
import java.util.Scanner;
public class MissingNum {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long expectedSum = n * (n + 1) / 2;
    long actualSum = 0;
    for(int i = 0;i < n - 1;i++){
        actualSum += sc.nextLong();
    }
    long missingNumber = expectedSum - actualSum;
    System.out.println(missingNumber);
    sc.close();
}
}
