import java.util.*;

class subarrSum{
// Finiding the sub Array Sum
    /**
     * 1) have a for loop pointing to the start position : i
     * 2) have one more index pointer and then point it to the start position : j
     * 3) now in the second for loop check if the sum of consecutive elements is equal to the required no
     * 4) if greater then break from the inner for loop
     *    else if you find the sum less than the reeq no then continue
     *    else if the sum is equal to the reg no set flag to 1 and break
     * 5) now in outer for loop check if the flag is equal to 1: uf yesprint the values of i and j
     */

    public static void ifsumexists(int[] a, int n){
        int flag = 0;
        int i,j,sum;
        for( i =0;i<a.length;i++){
            sum = 0;
            for( j = i ; j<a.length  && (sum<=n) ;j++){
                System.out.println("i:"  + i + " j:" + j + " " + a.length + " ");
                sum+=a[j];              
                if(sum>n)
                    break;
                else if(sum==n){
                    flag=1;
                }
                if(flag == 1){
                    System.out.println("start index:  ["+ i + "] end index :[" + j +"] sum");
                    for(int k = i;k<=j;k++){
                        System.out.print(a[k] + " ");
                    }
                    System.out.println();
                    return;
                }
            }

        }   
        System.out.print("NO consecutive no are equal to sum");     
    }

    public static void main(String args[]){

        
         int a[] = {1,2,3,0,1,2,3};
         int n = 2;
         ifsumexists(a,n);
    }
}