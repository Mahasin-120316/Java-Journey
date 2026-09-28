package Week08;

class Book1 {
    private int pageNum;

    public void setData(int x){
        if(x > 0){
           pageNum=x;
        }
    }

    public int getData(){
        return pageNum;
    }
}
public class BookApp1 {
    public static void main(String[] args){
        Book1 b1 = new Book1();
        b1.setData(100);
        System.out.println(b1.getData());
    }
}

