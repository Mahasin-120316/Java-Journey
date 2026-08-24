import java.util.Scanner;
public class Duplicate {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate Elements:");

        for (int i = 0; i < n; i++) {

            boolean duplicate = false;

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}

