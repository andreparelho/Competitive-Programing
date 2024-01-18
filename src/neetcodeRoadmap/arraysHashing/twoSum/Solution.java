package neetcodeRoadmap.arraysHashing.twoSum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] response = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target){
                    response[0] = i;
                    response[1] = j;
                    break;
                }
            }
        }

        return response;
    }

/* Test */
    public static void main(String[] args) {
        int[] nums = {3,1,8,3};
        int target = 6;

       /* int[] twoSumResponse = twoSum(nums, target);

        for (int i = 0; i < twoSumResponse.length; i++) {
            System.out.print(twoSumResponse[i]);
        }*/
    }
}
