class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        helper(candidates,target,0,new ArrayList<Integer>(),res);
        return res;
    }
    
    public void helper(int[] arr,int t,int i,List<Integer> curr,List<List<Integer>> res){
        if(t == 0){
            res.add(new ArrayList<Integer>(curr));
            return;
        }
        
        if(t<0 || i>=arr.length) return;
        
        
        for(int j = i; j < arr.length ; j++){
            curr.add(arr[j]);
            helper(arr,t-arr[j],j+1,curr,res);
            curr.remove(curr.size()-1);
            while(j<arr.length-1 && arr[j] == arr[j+1]){
                j++;
            }
        }
    }
}