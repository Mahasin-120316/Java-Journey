import java.util.Scanner;
public class Pgm1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter Array Elements: ");
        for(int i = 0;i <= a.length-1;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements: ");
        for(int i = 0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }
        sc.close();
    
        
    }
}
