import java.util.*;

public class largek{

    public static int findkthlagrest(int[] arr,int k){
        /*
            Step1: Sort the array
            Step2: Find array length
            Step3: return kTH largest arr[len-k]
        */

        Arrays.sort(arr);

        int len = arr.length;

        return(arr[len-k]);
    }

    public static void main(String args[]){
        int[] arr = new int[] {6,5,2,3,1,4,0};

        System.out.println(1 + "th largest element: " + findkthlagrest(arr, 1));
    }
}
