package Week05;
import java.util.Scanner;
public class MaxConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;
        for(int i = 0;i < n;i++){
            if(arr[i] == 1){
                count++;
            }

            else {
                count = 0;
            }

            if(count > max) {
                max = count;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
