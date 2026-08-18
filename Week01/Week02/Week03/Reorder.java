package Week03;

public class Reorder {
    public static void main(String[] args){
        int[] stock = {4,1,16,5,8};
        int reorderLevel = 5;
        int reorderCount = 0;
        for(int i = 0;i <= stock.length-1;i++){
            if(stock[i]<=reorderLevel){
                reorderCount++;
            }
        }
        System.out.println("Items to be reorder: " + reorderCount);
    }
}
