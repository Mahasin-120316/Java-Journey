package Week05;
import java.util.Scanner;
public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("First non-repeating element: ");
        for(int i = 0;i < n; i++){
            int count = 0;
            for(int j = 0;j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(-1);
        sc.close();
    }
}