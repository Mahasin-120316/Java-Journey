package Week07;
import java. util.Scanner;

public class Datatypes {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        float num2 = scan.nextFloat();
        String str1 = scan.next();
        String str2 = scan.next();
        byte num3 = scan.nextByte();
        System.out.print(num1+num2+str1+str2+num3);
        scan.close();
    }
}
