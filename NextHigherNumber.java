import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class NextHigherNumber {

    /**
     * The steps are:
     * 1) Store the digits of the num in a list in reverse order in the array[digits]
     * 2) Check if the "digits" is in ascending order
     * 3) if not then break at the element that deviates from the condition
     * 4) Store the ith element as D1
     * 5) Now from the digits array find the element that is greater than the ith element till D1
     * 6) Let the newly found no be D2
     * 7) Swap D1 and D2
     * 8) Now sublist the elements from [0,i] of digits
     * 9) Sort it using Collections.sort()
     * 10) Printing
     *      > print the element from i to 0 from digits
     *      > print the element from sublist
     */

     
    public static void nextHigherNumber(Integer num){
        Integer temp = num;
        ArrayList<Integer> digits = new ArrayList<Integer>();
        // num = 3284
        // Store all the digits of the num in the array digits from the 
        // right end
        //## digits = {4,8,2,3} (descending order)
        while( temp > 0){
            int digit = temp%10;
            temp = temp/10;
            digits.add(digit);
        }

        int j =0;
        int i = j+1;

        // if single digit num then no other no can be formed
        if(digits.size()>1){

            while(i< digits.size()){
                // compare the elements in the index i and j and 
                // they have to be increasing order from the right end
                // break at the point when the element ascending order condition
                // right end first element corresponds to the first element 
                // in the digits list
                if(digits.get(i) < digits.get(j)) {
                    break;
                }
                i++;
                j++;

            }
            // if the following if condition is satisfied then the element is 
            // the highest element so no other number can be formed
            if(i >= digits.size()){
                System.out.println("None");
                return;
            }

            j=0;
            // Starting from the first element indexed by j 
            // find an element that is greater than the ith element 
            // (the ele must be to the right of ith element)
            while(j < i){                
                if(digits.get(j) > digits.get(i)) {
                    break;
                }
                j++;
            }

            // Swap the digits
            int dg = digits.get(i);
            digits.set(i,digits.get(j));
            digits.set(j,dg);
        } else {
            System.out.println("None");
        }

        List<Integer> sublist = digits.subList(0,i);

        Collections.sort(sublist);

        int m = digits.size()-1;

        // Print the digits in reverse order from digit till the ele i
        while( m >= i){
            System.out.print(digits.get(m));
            m--;
        }
        // Now Print the sorted sublist
        m =0 ;
        while(m < sublist.size()){
            System.out.print(sublist.get(m));
            m++;
        }

        System.out.println();
    }
    
    public static void main(String args[]){
        nextHigherNumber(3284);
        nextHigherNumber(4321);
        nextHigherNumber(543841);
    }
}