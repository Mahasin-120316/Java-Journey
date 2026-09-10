import java.util.Scanner;
public class School {
    int id;
    String name;
    int javaScore;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        School s1 = new School();
        s1.id = sc.nextInt();
        s1.name = sc.next();
        s1.javaScore = sc.nextInt();

        School s2 = new School();
        s2.id = sc.nextInt();
        s2.name = sc.next();
        s2.javaScore = sc.nextInt();

        System.out.println(s1.id + " - " + s1.name + " - " + s1.javaScore);
        System.out.println(s2.id + " - " + s2.name + " - " + s2.javaScore);
        if (s1.javaScore > s2.javaScore){
            System.out.println(s1.name + "has the higher Java Score.");
        }else if(s2.javaScore > s1.javaScore){
            System.out.println(s2.name + "has the higher Java Score.");
        }else{
            System.out.println("Both have the same Java Score.");
        }
        sc.close();
    }
