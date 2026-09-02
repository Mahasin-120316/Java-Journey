package Week05;

import java.util.Scanner;
public class EvenOdd1 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = n-1;
        while(left < right){
            if(arr[left] % 2 == 0){
                left++;
            } else if(arr[right] % 2 != 0){
                right--;
            }
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        for(int i =0;i < n;i++){
            System.out.print(arr[i] +" ");
        }
        sc.close();
    }
}
