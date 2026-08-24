import java.util.Scanner;
public class Frequency2 {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int search = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] == search) {
                count++;
            }
        }

        System.out.println("Frequency = " + count);
        sc.close();
    }
}
