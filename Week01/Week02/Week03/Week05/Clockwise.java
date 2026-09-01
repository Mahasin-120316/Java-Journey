package Week05;
public class Clockwise {
    public static void main(String[] args){
        int[] arr = {10, 20, 30};
        int[] arr2 = new int[arr.length];
        int last = arr[arr.length-1];
        arr2[0] = last;
        for(int i = 0;i<arr.length-1;i++){
            arr2[i+1] = arr[i];
        }
        for(int i = 0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
