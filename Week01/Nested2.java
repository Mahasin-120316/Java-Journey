
public class Nested2 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        while (i <= 5) {
            while (j <= 5) {
                System.out.println(j);
                j++;
            }
            i++;
        }
    }
}
