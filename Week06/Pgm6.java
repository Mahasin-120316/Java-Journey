package Week06;

public class Pgm6 {
    public static void main(String[] args){
        String s1 = "Mahasin Humaira";
        System.out.println(s1);
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3, 8));
        System.out.println(s1.charAt(3));
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s1.contains("Humaira"));
        System.out.println(s1.replace('a', 'x'));
        System.out.println(s1.replace("Humaira", "Fathima"));
    }
}