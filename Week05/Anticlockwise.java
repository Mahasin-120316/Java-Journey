package Week05;
public class Anticlockwise {
    public static void main(String[] args){
       int[] arr = {12,23,34,45};
       int first = arr[0];
       int[] arr2 = new int[arr.length];
       for(int i = 0;i<arr.length-1;i++){
           arr2[i] = arr[i+1];
       }
       arr2[arr.length-1] = first;
       for(int i = 0;i<arr2.length;i++){
           System.out.println(arr2[i]);
       }
    }
}
