import java.util.*;

class packets{

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();

        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);
        int desc[] = new int[n];

        for(int i =0;i<n;i++){
            System.out.print(arr[i]);
        }

        System.out.println();
        
        int j=0;
        for(int i = arr.length-1;i>=0;i--){
            desc[j++] = arr[i];
        }
        System.out.println();
        j=0;
        for(int i = k+1;i<n;i++){
            arr[i] =  desc[j++] ;
        }

        for(int i =0;i<n;i++){
            System.out.print(arr[i]);
        }

        System.out.println();
        //Arrays.sort(a, fromIndex, toIndex);
    }
}