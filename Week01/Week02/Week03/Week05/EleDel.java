package Week05;
public class EleDel {
    public static void main(String[] args){
        int [] arr = {10,20,30,40,50};
        int [] arr2 = new int[4];
        int element = 30;
        int index = 2;
        for(int i=0;i<arr2.length;i++){
            if(i<index){
                arr2[i] = arr[i];
            }
            else{
                arr2[i] = arr[i+1];
            }
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
