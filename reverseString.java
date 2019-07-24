import java.util.*;


public class reverseString{
    public static void main(String args[]){
        String str = "i like this program very much",ans = "";

        String s[] = str.split(" ");

        for( int i =s.length-1;i >= 0;i--){
            ans+= s[i] + " ";
        }
        System.out.println( "The Reverse list of words: " + ans);
        ans = " ";
        for(int i = 0; i<s.length;i++){
            for(int j =s[i].length()-1;j>=0;j--){
                ans+= s[i].charAt(j);
            }
            ans += " ";
        }
        
        System.out.println("The reversed letters of the words in the sentense: "+ans);

    }
}