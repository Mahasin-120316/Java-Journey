package Week06;

public class StringComp2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        char[] c1 = s1.toCharArray();
        for(int i = 0; i <= c1.length-1;i++){
            System.out.println(c1[i]);
        }
        String res = new String(c1);
        System.out.println(res);
    }
}
