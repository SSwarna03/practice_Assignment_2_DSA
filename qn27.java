class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1 = nums1.length;
        int num2 = nums2.length;
        int num = num1 + num2;
        int[] arr = new int[num];

        int i=0, j=0, k=0;

        while (i<=num1 && j<=num2) {
            if (i == num1) {
                while(j<num2) arr[k++] = nums2[j++];
                break;
            } else if (j == num2) {
                while (i<num1) arr[k++] = nums1[i++];
                break;
            }

            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }

        if (num%2==0) return (float)(arr[num/2-1] + arr[num/2])/2;
        else return arr[num/2];
    }
}