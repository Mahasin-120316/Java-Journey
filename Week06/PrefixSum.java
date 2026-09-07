package Week06;
import java.util.Scanner;
public class PrefixSum {
public static void main(String[] args) {
    Scanner sc = new Scanner(System. in);
    int n = sc.nextInt();
    long sum = 0;
    for(int i = 0;i < n; i++){
        sum += sc.nextLong();
        System.out.print(sum + " ");
    }
    sc.close();
}
}
