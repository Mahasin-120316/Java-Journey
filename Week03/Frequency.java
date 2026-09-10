package Week03;
class Freq{
    int count = 0;
    void count(int arr[], int key){
        for(int i = 0;i <= arr.length-1;i++){
            if(arr[i] == key){
                System.out.println("Element found at index: " + i);
                count++;
            }
        }
        System.out.println("Element found " + count + " times");
    }
}
public class Frequency{
    public static void main(String[] args){
        int[] arr = {10,20,10,30,10,40,10};
        Freq f = new Freq();
        f.count(arr, 10);
    }
}