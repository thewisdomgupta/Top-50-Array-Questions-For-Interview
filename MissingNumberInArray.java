public class MissingNumberInArray {
    public static void main(String [] args){
        int [] arr={1,2,3,4,5,6,7,8,10};
        int sum=(10*(10+1))/2;
        int sumArray=0;
        for(int i=0; i< arr.length; i++){
            sumArray=sumArray+arr[i];
        }
        int diff=sum-sumArray;
        System.out.println("Missing Element is:"+" "+diff);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
