import java.util.*;
public class anagram{
    public static boolean isAna(String s, String t){
        /*
            Step1: Convert the string to char Array
            Step2: Sort the Array
            Step3: Convert to string
            Step4: Compare

            Time Complexity = o(nlogn) (due to the inbuilt quick sort function used)

        */
        
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String s1 = new String(arr1);
        String t1 = new String(arr2);

        if(s1.equals(t1)){
            return true;
        }
        else 
            return false;

    }


    public static void main(String[] args){
        boolean a = isAna("nt","tan");
        System.out.println("The Output is: "+ a);
               
    }
}