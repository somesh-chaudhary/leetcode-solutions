class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] a, int l, int u) {
        boolean[]b=new boolean[u+1];
        for(int x:a)if (x>=l && x<= u) b[x]=true;
        List<List<Integer>>r=new ArrayList<>();
        int s=-1;
        for(int i=l;i<=u+1;i++){
            if(i<=u && !b[i]){
                if(s==-1)s=i;
            }else if(s!=-1){
                r.add(Arrays.asList(s,i-1));
                s=-1;
            }
        }
        return r;
        
    }
}