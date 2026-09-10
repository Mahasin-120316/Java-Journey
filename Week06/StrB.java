package Week06;

public class StrB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
        sb.append("Java");
        System.out.println("Content: " + sb);
    }
}
