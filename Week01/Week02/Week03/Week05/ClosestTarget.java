package Week05;
import java.util.Scanner;
public class ClosestTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int closest = arr[0];
        for(int i = 0;i < n;i++){
            int diff1 = arr[i] - target;
            int diff2 = closest - target;
            if(diff1 < 0){
                diff1 = -diff1;
            }
            if(diff2 < 0){
                diff2 = -diff2;
            }
            if (diff1 < diff2){
                closest = arr[i];
            }
            else if(diff1 == diff2 && arr[i] < closest){
                closest = arr[i];
            }
        }
    System.out.println(closest);
    sc.close();
    }
}

