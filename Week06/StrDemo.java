package Week06;

public class StrDemo {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Java");
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Programming");
        System.out.println(sb);
        sb.insert(0, "Mahasin");
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}
