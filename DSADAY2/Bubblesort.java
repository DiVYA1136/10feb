import java.lang.reflect.Array;
import java.util.Arrays;
public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {90,32,01,11,36};
        System.out.println("Before : "+Arrays.toString(arr));
        bubblesort(arr);
        System.out.println("After : "+Arrays.toString(arr));


    }
    private static void bubblesort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
          for(int j=0;j<arr.length-i-1;j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
                  }  
        }
    }
    
}
