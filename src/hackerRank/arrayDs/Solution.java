package hackerRank.arrayDs;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> reverseArray(List<Integer> a) {
        List<Integer> reverseList = new ArrayList<>();

        for (int i = a.size() - 1; i >= 0; i--) {
            reverseList.add(a.get(i));
        }

        return reverseList;
    }

    /* Test */
    public static void main(String[] args) {
        List<Integer> reverseList = new ArrayList<>();
        reverseList.add(1);
        reverseList.add(2);
        reverseList.add(3);
        reverseList.add(4);

        /*System.out.println(reverseArray(reverseList));*/
    }
}
