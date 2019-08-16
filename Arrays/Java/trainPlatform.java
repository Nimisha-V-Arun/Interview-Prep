import java.util.*;

public class trainPlatform{

    public static int findNoOfPlatform(int[] arr,int dep[] , int n){
        int i=1,j=0,platform = 1,result = 1;
        Arrays.sort(arr);
        Arrays.sort(dep);
        // i = 1 as the first platform is already counted
        // sorting the array will decrease the time complexity to O(nlog(n))
        
        while(i < n && j < n){
            if(arr[i]<dep[j]){
                platform++;
                i++;
                // find the maximum no of platform in this loop itself
                if(platform > result)
                    result = platform;
            }
            else{
                platform--;
                j++;
            }
        }
        return result;    
    }
    public static void main(String args[]){
        int arr[] = {900, 940, 950, 1100, 1500, 1800}; 
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000}; 

        int n = arr.length;
        System.out.println("The maximum no of platforms needed are : " + findNoOfPlatform(arr,dep,n));


    }
}