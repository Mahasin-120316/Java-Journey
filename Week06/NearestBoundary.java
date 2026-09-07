package Week06;
import java.util.Scanner;
public class NearestBoundary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        numbers[0] = scanner.nextLong();
        long minVal = numbers[0];
        long maxVal = numbers[0];
        for (int i = 1; i < n; i++) {
        numbers [i] = scanner.nextLong();
        if(numbers [i] < minVal){
            minVal = numbers[i];
        }if(numbers [i] > maxVal){
            maxVal = numbers[i];
        }
    }

        int minGroupCount = 0;
        int maxGroupCount = 0;
        for(int i = 0;i < n;i++){
        long distMin = numbers [i] - minVal;
        long distMax = maxVal - numbers[i];
        if(distMin < distMax){
            minGroupCount++;
        } else if(distMax < distMin){
            maxGroupCount++;
        }
    }
    System.out.println(minGroupCount + " "+ maxGroupCount);
    scanner.close();
}
}


