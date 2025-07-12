import java.util.*;
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        
        Arrays.sort(nums);

        int[] res = new int[queries.length];
        

       

        for(int i=1;i<nums.length;i++){
            nums[i] += nums[i-1] ;
        }

        for(int i=0;i<queries.length;i++){
           res[i] = upperBound(nums,queries[i]);
        }
        return res;
    }

    

    private int upperBound(int[] pref,int target){
        int l = 0 ;
        int r = pref.length;

        while(l<r){
            int mid = l + (r-l)/2;
            if(pref[mid]>target){
               r = mid;
            }else{
               l = mid + 1;
            }

        }
        return l;
    }
}