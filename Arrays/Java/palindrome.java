public class palindrome{

    public static boolean isPal(int inp){

        /*
            Step1: convert the integer to string
            Step2: Reverse the String
            Step3: check the equivalence
        */

        String s = Integer.toString(inp);

        String rev = new StringBuilder(s).reverse().toString();

        if(s.equals(rev)){
            return true;
        }
        else 
            return false;
    }

    public static void main(String args[]){
        System.out.println("Output:" + isPal(1234));
        System.out.println("Done !!");

    }
}