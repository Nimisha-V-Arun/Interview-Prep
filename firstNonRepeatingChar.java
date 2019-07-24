import java.util.*;

class firstNonRepeatingChar{
    static char[] charCount = new char[256];

    
    public static char[] getCharCount(String word){
        for(int i =0;i<word.length();i++){
            charCount[word.charAt(i)]++;
        }

        return charCount;
    }

    public static int findChar(String word){

        int index = -1;
        getCharCount(word);
        for(int i =0;i<word.length();i++){
            if(charCount[word.charAt(i)] == 1){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String args[]){

        String word = "GeekffoorrGeekss";
        int index = findChar(word);

        if(index == -1){
            System.out.println("No non repeats");
        }
        else
            System.out.println("The first non repeating charachter of an array :" + word.charAt(index));
    }

}