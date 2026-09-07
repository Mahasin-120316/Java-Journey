package Week06;

import java.util.Scanner;
public class TargetBoundary {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] numbers = new int[n];
    for(int i = 0; i < n; i++){
        numbers[i] = scanner.nextInt();
    }
    int target = scanner.nextInt();
    int firstIndex = -1;
    int lastIndex = -1;
    for(int i = 0;i < n; i++){
    if(numbers [i] == target){
    if(firstIndex == -1){
        firstIndex = i;
    }
    lastIndex = i;
    }
}
    if(firstIndex == -1){
        System.out.println(-1);
        return;
    }
    int left = firstIndex;
    int right = lastIndex;
    while(left < right){
        int temp = numbers[left];
        numbers [left] = numbers [right];
        numbers[right] = temp;
        left++;
        right--;
    }
    for(int i = 0;i < n;i++){
        System.out.print(numbers[i] + " ");
    }
    System.out.println();
    scanner.close();
}
}
