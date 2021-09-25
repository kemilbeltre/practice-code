package TwoSum;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                int complement = target - nums[i];

                if (nums[j] == complement) {
                    System.out.println(i);
                    System.out.println(j);
                    return new int[] {i, j};
                }
            }
        }

        throw new IllegalArgumentException("no match found");
    }

    // Driver code
    public static void main(String[] args) {
         int[] nums = {1, 2, 3 , 4};

        twoSum(nums, 5);
    }

}
