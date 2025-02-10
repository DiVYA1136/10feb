import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int arr[] = {99,85,11,11,36};
        System.out.println("Before : " +Arrays.toString(arr));
        Selectionsort(arr);
        System.out.println("After : "+Arrays.toString(arr));

    }
    private static void Selectionsort(int[] brr){
        for (int i = 0; i < brr.length; i++) {
            for(int j =i+1;j<brr.length;j++){
                if(brr[i]>brr[j]){
                    int temp = brr[i];
                    brr[i] = brr[j];
                    brr[j] = temp;
                }
            }
        }
    }
}
