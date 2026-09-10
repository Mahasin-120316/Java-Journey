package Week03;
import java.util.Scanner;
public class ThreeDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][][] = new int[3][3][5];
        for(int i = 0;i < arr.length; i++){
            for(int j = 0;j < arr[i].length; j++){
                for(int k = 0;k < arr[i][j].length; k++){
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        for(int i = 0;i < arr.length-1; i++){
            for(int j = 0;j < arr[i].length-1; j++){
                for(int k = 0;k < arr[i][j].length-1; k++){
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}
