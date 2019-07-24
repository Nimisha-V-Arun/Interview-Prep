import java.util.*;

public class rotateArr{
    void leftRotate(int[] arr, int d){
        int[] temp = new int[10];
        int i;
        /*
            Step1 : Copy the first d ele to temp
            Step2: shift the org array d pos to left
            Step3: copy temp to last d positions 
        */
        for( i = 0 ; i<d;i++ ){;
            temp[i] = arr[i];
        }

        for( i =0 ;i<arr.length-d; i++){
            arr[i] = arr[i+d];
        }

        // Important
        i = arr.length - d;
        int j = 0;
        while(i < arr.length && j < d )
            arr[i++] = temp[j++];

        for(i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]){
        rotateArr r = new rotateArr();
        int[] arr = {1,2,3,4,5};
        int d = 17%5;
        r.leftRotate(arr,d);
    }
}

/*

class RotateArray { 
    //Function to left rotate arr[] of size n by d
    void leftRotate(int arr[], int d, int n) 
    { 
        for (int i = 0; i < d; i++) 
            leftRotatebyOne(arr, n); 
    } 
  
    void leftRotatebyOne(int arr[], int n) 
    { 
        int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < n - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = temp; 
    } 
  
    // utility function to print an array 
    void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
    // Driver program to test above functions 
    public static void main(String[] args) 
    { 
        RotateArray rotate = new RotateArray(); 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        rotate.leftRotate(arr, 2, 7); 
        rotate.printArray(arr, 7); 
    } 
} 

 */