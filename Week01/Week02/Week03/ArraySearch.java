package Week03;

class SearchArray {
    void search(int[] ref,int key){
        boolean found = false;
        for(int i = 0;i<=ref.length-1;i++){
            if(ref[i]==key){
                System.out.println( "Element found at index: " + i);
                found=true;
                break;
                }
            }
            if (found == false) {
                System.out.println("Element not found");
            }
        }
    }

public class ArraySearch{
    public static void main(String[] args) {
        int[] arr = {45,36,35,58,20,50};
        int key = 23;
        SearchArray s = new SearchArray();
        s.search(arr, key);
    }
}

