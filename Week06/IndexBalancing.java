package Week06;
import java.util.Scanner;
public class IndexBalancing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        long evenSum = 0;
        long oddSum = 0;
        for (int i = 0; i < n; i++) {
            long num = scanner.nextLong();
            if(i % 2 == 0){
                evenSum += num;
            } else{
                oddSum += num;
            }

            long diff = evenSum - oddSum;
            if(diff < 0){
                diff = -diff;
            }

            System.out.print(diff + " ");
        }
        scanner.close();
    }
}
