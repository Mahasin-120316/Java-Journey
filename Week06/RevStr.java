package Week06;
import java.util.Scanner;
public class RevStr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        char arr[] = str.toCharArray();
        char newArr[] = new char[arr.length];
        int j = newArr.length-1;
        for(int i = 0; i < arr.length; i++){
            newArr[j] = arr[i];
            j--;
        }
        String revStr = new String(newArr);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + revStr);
        sc.close();
    }
}
