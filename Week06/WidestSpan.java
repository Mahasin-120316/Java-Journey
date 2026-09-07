package Week06;
import java.util.Scanner;
public class WidestSpan {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] numbers = new int[n];
    for(int i = 0; i < n; i++){
        numbers[i] = scanner.nextInt();
    }
    int selectedValue = numbers[0];
    int widestSpan = -1;
    for(int i = 0;i < n; i++){
        int lastIndex = i;
        for(int j = n - 1;j < n;j -- ){
            if(numbers [j] == numbers[i]){
            lastIndex = j;
            break;
        }
    }
    int currentSpan = lastIndex - i;
    if(currentSpan > widestSpan){
    widestSpan = currentSpan;
    selectedValue = numbers[i];
    }
    }
    System.out.println(selectedValue + " " + widestSpan);
    scanner.close();
}
}
