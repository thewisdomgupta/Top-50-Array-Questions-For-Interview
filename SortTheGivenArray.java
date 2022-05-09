import java.util.Arrays;

public class SortTheGivenArray {
    public static void main(String [] args){
        int [] arr = {1,5,3,2};
        System.out.println("Array is:");
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);
        System.out.println("Sorted Array is:");
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
//This Code is Contributed by Vivek Kumar Gupta
