class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        char[] S=s.toCharArray();
        int z1=0;
        for(char c: S)if(c=='0')z1++;
        boolean[] ans =new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            char[] T=strs[i].toCharArray();
            int z2=0,q=0;
            for(char c:T){if(c=='0')z2++;else if(c=='?')q++;}
            int req=z1-z2;
            if(req<0||req>q)continue;
            int c1=0,c2=0;
            ans[i]=true;
            for(int j=0;j<S.length;j++){
                if(S[j]=='0')c1++;
                if(T[j]=='0'||(T[j]=='?'&& req-->0))c2++;
                if(c2<c1){ans[i]=false;break;}
            }
        }
        return ans;
        
    }
}