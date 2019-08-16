import java.util.*;

public class zigZagArr{

    int arr[];
    
    zigZagArr(int arr[]){
        this.arr = arr;
    }


    static void swap(zigZagArr zz, int i,int j){
        int temp = zz.arr[i];
        zz.arr[i] = zz.arr[j];
        zz.arr[i+1] = temp;
        
    }

    void arrange(int[] arr){
        boolean flag = true;// '<''

        for(int i =0;i<arr.length-1;i++){
            if(flag){
                if(arr[i] > arr[i+1]){
                    swap(zz,i,i+1);
                }
            }else{
                if(arr[i] < arr[i+1]){
                    swap(zz,i,i+1);
                }
            }
            flag = !flag;
        }        

        for(int i =0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr = new int[n];
        for(int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        zigZagArr zz = new zz(arr);

        zz.arrange(arr);
    }
}
