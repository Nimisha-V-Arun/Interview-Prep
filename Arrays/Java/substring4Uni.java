import java.util.*;

class substring4Uni{
    static char[] count = new char[256];

    public static char[] getCharCount(String word){
        count['a'] = 0;
        for(int i =0;i<word.length();i++){
            count[word.charAt(i)]++;
        }
        System.out.println(count['a']);
        return count;
    }

    public static void kandanes(String str,char[] charCount){
        if(str.length() == 4 && charCount.length == 4)
                return;
        else{
            int st=0,end =0,maxSt=0,maxEnd = 0,count =0;
            for(int i =0;i<=str.length()-4;i++){
                    st = i;
                    if(charCount[str.charAt(i)] == 1){
                        for(int j=i+1;j<str.length();j++){
                            System.out.print(count + " ");
                            if(charCount[str.charAt(i)] == 1){
                                count++;
                                
                            }
                            if(count > 4)
                                break;
                            end++;
                        }
                        if(count == 4){
                            if((end-st)> (maxSt-maxEnd)){
                                maxSt = st;
                                maxEnd = end;
                            }
                        }
                    }
            }
            System.out.println( "maxSt"+ maxSt);
            System.out.println("maxEnd"+maxEnd);
            for(int i =maxSt;i<maxEnd;i++){
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        char[] charCount = new char[str.length()];
        if(str.length()<4){
            System.out.println("No sub string");
        }
        else{
            charCount = getCharCount(str);
            kandanes(str,charCount);
        }
    }
}