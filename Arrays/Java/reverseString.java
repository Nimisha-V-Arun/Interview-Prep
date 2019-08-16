import java.util.*;


public class reverseString{
    public static void main(String args[]){
        String str = "i like this program very much",ans = "";
        // We first split the String wrt " " into an array of strings
        String s[] = str.split(" ");

        //We now print the array from the last element to get the reversed list
        // of strings
        for( int i =s.length-1;i >= 0;i--){
            ans+= s[i] + " ";
        }
        System.out.println( "The Reverse list of words: " + ans);
        // Do not forget to reinitialize the String ans
        ans = " ";

        // Now for each element of the String Array
        // print each element in the reverse order
        for(int i = 0; i<s.length;i++){
            for(int j =s[i].length()-1;j>=0;j--){
                ans+= s[i].charAt(j);
            }
            ans += " ";
        }
        
        System.out.println("The reversed letters of the words in the sentense: "+ans);

    }
}