package Week07;
import java.util.Scanner;

public class EvenOdd {

public static void main (String[] args)
{
Scanner scan = new Scanner(System.in);
int n=scan.nextInt();

if (n % 2 == 0)
{
    System.out.println("even");
}
else{
    System.out.println("odd");
}
scan.close();
}
}
