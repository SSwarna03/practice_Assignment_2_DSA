class Solution {
    List<List<Integer>> list = new ArrayList();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        recursion(new ArrayList(),0,0, candidates, target);
        return list;
    }
    void recursion(List<Integer> l,int index, int sum, int[] candidates, int target){
        if(sum==target) list.add(new ArrayList<>(l));

        for(int i=index; i<candidates.length; i++){
            if(sum+candidates[i]>target) continue;
            l.add(candidates[i]);
            recursion(l,i,sum+candidates[i], candidates, target);
            l.remove(l.size()-1);
        }
    }
}