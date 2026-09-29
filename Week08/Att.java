package Week08;
import java. util. Scanner;
class Attendance {
    private int presentDays;
    public void addDays(int days){
        if(days >0){
            this.presentDays += days;
        }
    }
    public int getPresentDays() {
        return this.presentDays;
    }
}
public class Att {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        int days = scanner.nextInt();
        Attendance a = new Attendance();
        a.addDays (days);
        System.out.println(a.getPresentDays());
        scanner.close();
    }
}
