public class missingNo {

    /*
        XOR
        ((1^2^3^4) ^ (1^2^3)) = 4
    */
    public int missing(int[] nums){

        int val = 0,i;
        int len = nums.length;
        for(i = 0 ;i<=len;i++){ // Do not forget the (=) symbol
            val = val ^ i;
        }

        int xorArr = 0;
        for(i =0;i<len;i++){
            xorArr = xorArr ^ nums[i];
        }

        return(xorArr ^ val);
    }

    public static void main(String args[]){

        missingNo m = new missingNo();
        int[] arr = {1,2,3,4,0};

        System.out.println("Missing no is:" + m.missing(arr));
    }
}