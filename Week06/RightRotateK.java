package Week06;
import java.util.Scanner;
public class RightRotateK {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] numbers = new int[n];
    for(int i = 0;i < n;i++){
        numbers[i] = scanner.nextInt();
    }
    int left = scanner.nextInt();
    int right = scanner.nextInt();
    int k = scanner.nextInt();
    if(left < 0 || right >= n || left > right) {
        System.out.println("-1");
        return;
    }

    int len = right - left + 1;
    k = k % len;
    for(int r = 0;r < k;r++){
        int last = numbers [right];
        for(int i = right;i > left;i -- ){
            numbers [i] = numbers[i - 1];
        }
        numbers [left] = last;

        for(int i = 0;i < n;i++){
        System.out.print (numbers[i] + " ");
        }
    }
    scanner.close();
}
}
