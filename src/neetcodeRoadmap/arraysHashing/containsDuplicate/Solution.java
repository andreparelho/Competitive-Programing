package neetcodeRoadmap.arraysHashing.containsDuplicate;

import java.util.ArrayList;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int num : nums) {
            if (arrayList.contains(num)){
                return true;
            }
            arrayList.add(num);
        }
        return false;
    }

//    Test
    public static void main(String[] args) {
        int[] ints = {1,3,4,6,1};
        //System.out.println(containsDuplicate(ints));
    }
}
