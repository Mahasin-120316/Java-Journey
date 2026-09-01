package Week05;
public class Ele{
    public static void main(String[] args){
        int [] arr = {10, 20, 40, 50};
        System.out.println("The elements of the array are");
        int [] arr2 = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
            System.out.println(arr2[i]);
        }
        int element = 30;
        int index = 2;
        for(int i = arr.length-1;i >=index;i--){
            arr2[i+1] = arr[i];
        }
        arr2[index] = element;
        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}