import java.util.*;

class triplets{
// Finiding a[i] + a[i+1] = a[i+2]


    public static void ifsumexists(int[] a, int n){
        int flag = 0;
        int i,j,sum,count=0;
        for( i =0;i<a.length-2;i++){
            sum = a[i]+a[i+1];
            if(sum == a[i+2]){
                count++;
                System.out.println(a[i]+ " + " + a[i+1] + " = " + a[i+2] );
            }
            

        }   
        if(count == 0 )
            System.out.print("NO consecutive no are equal to sum");     
        else{
            System.out.println("The total no of triplets is " + count);
        }
    }
    public static void main(String args[]){

        
         int a[] = {1,3,-1,1,2,5};
         int n = 2;
         ifsumexists(a,n);
    }
}