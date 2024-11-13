class Solution {
    public boolean isPalindrome(String s) {
        int lp, rp;
        for(lp=0, rp=s.length()-1; lp<rp; lp++,rp--){
            while(lp<rp && !Character.isLetterOrDigit(s.charAt(lp))){
                lp++;
            }
            while(lp<rp && !Character.isLetterOrDigit(s.charAt(rp))){
                rp--;
            }
            if(Character.toLowerCase(s.charAt(lp))!= Character.toLowerCase(s.charAt(rp))){
                return false;
            }
        }
        return true;
    }
}