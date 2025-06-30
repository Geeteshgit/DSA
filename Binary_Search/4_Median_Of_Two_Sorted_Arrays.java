package Binary_Search;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length + nums2.length];
        int p1 = 0;
        int p2 = 0;
        int i = 0;
        while(p1 < nums1.length && p2 < nums2.length) {
            if(nums1[p1] <= nums2[p2]) {
                result[i] = nums1[p1];
                p1++;
            }
            else {
                result[i] = nums2[p2];
                p2++;
            }
            i++;
        }
        while(p1 < nums1.length) {
            result[i] = nums1[p1];
            p1++;
            i++;
        }
        while(p2 < nums2.length) {
            result[i] = nums2[p2];
            p2++;
            i++;
        }
        if(result.length % 2 != 0) return (double)result[result.length / 2];
        else{
            double ans = (((double)result[result.length / 2]) + (result[(result.length / 2) - 1])) / 2;
            return ans;
        }
    }
}

