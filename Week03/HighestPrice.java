import java.util.Scanner;
public class HighestPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] price = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        int highest = price[0];

        for (int i = 1; i < n; i++) {
            if (price[i] > highest) {
                highest = price[i];
            }
        }

        System.out.println("Highest Price: " + highest);    
        sc.close();

    }
}

