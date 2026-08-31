package Week05;
import java.util.Scanner;
public class CountSumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > average) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}

