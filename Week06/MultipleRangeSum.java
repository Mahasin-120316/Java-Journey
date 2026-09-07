package Week06;

import java.util.Scanner;
public class MultipleRangeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] prefix = new long[n];
        prefix[0] = sc.nextLong();
        for(int i = 1;i < n; i++){
            prefix[i] = prefix[i - 1] + sc.nextLong();
        }
        int q = sc.nextInt();
        for(int i = 0;i < q;i++){
            int left = sc.nextInt();
            int right = sc.nextInt();
            if(left == 0){
                System.out.println(prefix[right]);
            }else{
                System.out.println(prefix[right] - prefix[left - 1]);
            }
        }
        sc.close();
    }
}
