class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        // vector to store all numbers in order
        vector<int> nums3;
        
        // populate 'nums3' with numbers in order from smallest to largest
        int i = 0, j = 0;
        while (i < nums1.size() && j < nums2.size()) {
            int nextSmallestNum = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
            nums3.push_back(nextSmallestNum);
        }
        
        // add the rest of the numbers from the longer array (nums1 or nums2) to nums3
        if (i == nums1.size())
            for (; j < nums2.size(); j++) nums3.push_back(nums2[j]);
        else if (j == nums2.size())
            for (; i < nums1.size(); i++) nums3.push_back(nums1[i]);
        
        // calculate median
        double ans = nums3[nums3.size() / 2];                       //        |  |
                                                                    //        V  V
        // if even length - calculate median with number to left as well ([1, 2, 3, 4])
        // add them and half it to get the median
        if (nums3.size() % 2 == 0) {
            double ans2 = nums3[(nums3.size() / 2) - 1];
            ans = (ans + ans2) / 2;
        }
        
        return ans;
    }
};
