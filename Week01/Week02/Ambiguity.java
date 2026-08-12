class Method{
    void(short a, short b){

        void(int a, int b){
            System.out.println("int");
        }
    }
}
public class Ambiguity{
    public static void main(String[] args){
        Method m = new Method;
        m.void(10,10);
    }
}