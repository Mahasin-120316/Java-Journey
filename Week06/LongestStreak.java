package Week06;
import java.util.Scanner;
public class LongestStreak {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] numbers = new int[n];
    for(int i = 0; i < n; i++){
        numbers[i] = scanner.nextInt();
    }
    int bestStart = 0;
    int bestLength = 1;
    int currentStart = 0;
    int currentLength = 1;
    for(int i = 1;i < n; i++){
        if(numbers [i] < numbers [i - 1]){
            currentLength++;
        } else{
            currentStart = i;
            currentLength = 1;
        }
        if(currentLength > bestLength) {
            bestLength = currentLength;
            bestStart = currentStart;
        }
    }
    System.out.println(bestStart + " " + bestLength);
    scanner.close();
}
}
