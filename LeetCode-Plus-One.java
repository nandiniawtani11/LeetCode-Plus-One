class Solution {
    public int[] plusOne(int[] digits) {
        int r=1;
        for(int i=digits.length-1;i>=0;i--)
        {
            int inc=digits[i]+r;
            digits[i]=inc;
            r=0;
            if(inc>9)
            {
                digits[i]=inc%10;
                r=inc/10;
            }
        }
        if(r!=0)
        {
            int[] arr=new int[digits.length+1];
            System.arraycopy(digits,0,arr,1,digits.length);
            arr[0]=r;
            return arr;
        }
        return digits;
    }
}
