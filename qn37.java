class Solution {
    public int removeElement(int[] nums, int val) {
          int ele = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != val) {
                nums[ele] = nums[i];
                ele++;
            }
        }

        return ele;
    }
}