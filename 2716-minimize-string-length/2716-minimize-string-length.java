class Solution {
    public int minimizedStringLength(String s) {
        int count =0;

        Set <Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(set.contains(c)) continue;
            set.add(c);
            count++;
        }
        return count;
        
    }
}