import java.util.*;

class threeWayPartitioning{

    public static void main(String args[]){
        //Convert the String to charArray
        char[] rgb = "ggrrbbrg".toCharArray();
        int p =0,q=rgb.length-1;

        // Now traverse form the 0th element to the qth element
        for(int i =0 ;i<=q;){
            // remember that for char comparison we must use single quotes
            // Print this for verification : System.out.println(i + " " + p + " " + q);

            // if the ith ele is r then swap the ele to the pth position and incr p and i
            // So as to have only 'r' to the  left of p in the array
            
            if(rgb[i] == 'r'){
                char t = rgb[i];
                rgb[i] = rgb[p];
                rgb[p] = t;
                p++;
                i++; 
            }
            else if(rgb[i] == 'b'){

            // if the ith ele is b then swap the ele to the qth position and decr q
            // So as to have only 'b' to the  right of q in the array
                char t = rgb[i];
                rgb[i] = rgb[q];
                rgb[q] = t; 
                q--;
            }else{
                i++;
            }
        }
    for(int i = 0;i<rgb.length-1;i++)
        System.out.print(rgb[i]);  
    System.out.println();
    }
}