class Solution {
    public String rearrangeString(String s, char x, char y) {

        StringBuilder sy=new StringBuilder();
        StringBuilder sx=new StringBuilder();
        StringBuilder so=new StringBuilder();

        for(char c : s.toCharArray()){
            if(c==y)sy.append(c);
            else if(c==x)sx.append(c);
            else so.append(c);
        }

        return sy.toString()+so.toString()+sx.toString();
        
    }
}