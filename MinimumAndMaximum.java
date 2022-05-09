import java.util.Arrays;
import java.util.Scanner;

public class MinimumAndMaximum {
    public static void main(String [] args){
        Scanner vivek = new Scanner(System.in);
        System.out.println("Enter the Array Length:");
        int n = vivek.nextInt();
        System.out.println("Enter the Array Elements:");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= vivek.nextInt();
        }
        System.out.println("Entered Array Elements are:");
        System.out.println(Arrays.toString(arr));
        //Find Minimum
        int min=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Element is:"+ " "+min);
        //Find Maximum
        int max=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Element is:"+ " "+max);
    }
}
//This code is Contributed by Vivek Kumar Gupta
