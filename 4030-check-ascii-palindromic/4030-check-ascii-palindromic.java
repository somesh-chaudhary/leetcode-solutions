class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<s.length();i++){
            String bin =String.format("%8s",Integer.toBinaryString(s.charAt(i))).replace(' ','0');
            sb.append(bin);
        }
        String res=sb.toString();
        int l=0,r=res.length()-1;
        while (l<r){
            if(res.charAt(l)!=res.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }
}