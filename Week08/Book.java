package Week08;

public class Book{
    private int pageNum;
    public void setData(int x){
        pageNum=x;
    }

    public void getData(){
        System.out.println("Pages in the book: "+pageNum);
    }
    
}

class BookApp{
    public static void main(String[] args){
        Book book = new Book();
        book.setData(100);
        book.getData();
    }
}
