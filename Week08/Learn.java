package Week08;
import java.util. Scanner;
class Learner{
private int age;
public void setAge(int age){
this.age = age;
}

public int getAge(){
return age;

}
}

public class Learn{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
Learner l1 = new Learner();
l1.setAge(age);
System.out.println(l1.getAge());
sc.close(); 
}
}
