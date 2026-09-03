package Week05;
import java.util.Scanner;
public class Suffix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int[] suffix = new int[n];
        suffix[n - 1] = arr[n -1];
        for(int i = n - 2;i >=0;i--){
            suffix[i] = suffix[i+1] + arr[i];
        }
        System.out.println("Suffix array is");
        for(int i = 0;i < n;i++){
            System.out.print(suffix[i] + " ");
        }
        sc.close();
    }
}

