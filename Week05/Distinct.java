package Week05;
import java.util.Scanner;
public class Distinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 1;i < n; i++){
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            if(secondLargest == Integer.MIN_VALUE) {
                System.out.println("No second largest distinct value");
            }
            else{
                System.out.println(secondLargest);
            }
            }
    }
}
}

