import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//this is the solution to the find the sum of the targetted element
class Solution {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        int target= 6;
        Solution s= new Solution();
        int[] a= s.twoSum(arr,target);
        System.out.println(a[0]+ ""+a[1]);
    }
    public int[] twoSum(int[] nums, int target) {

        Set<Integer> set = new HashSet<>();
        List<Integer> finder= new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            finder.add(nums[i]);

        }
        set.addAll(finder);
        System.out.println(finder);

        // Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            // Compute the complement of the current element
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (set.contains(complement)) {
                // If it is, we have found the two numbers that add up to the target
                return new int[] { finder.indexOf(complement), i };
            }

        }

        // If we reach here, we have not found the two numbers
        throw new IllegalArgumentException("No two numbers add up to the target");
    }
}