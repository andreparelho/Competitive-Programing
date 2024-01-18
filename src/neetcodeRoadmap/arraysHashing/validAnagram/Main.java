package neetcodeRoadmap.arraysHashing.validAnagram;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public boolean isAnagram(String s, String t) {
        ArrayList<String> listS = new ArrayList<>();
        ArrayList<String> listT = new ArrayList<>();

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        for (int i = 0; i < charS.length; i++) {
            listS.add(String.valueOf(charS[i]));
        }

        for (int i = 0; i < charT.length; i++) {
            listT.add(String.valueOf(charT[i]));
        }

        Collections.sort(listS);
        Collections.sort(listT);

        if (listS.equals(listT)){
            return true;
        }

        return false;
    }

//    Test
    public static void main(String[] args) {
        String s = "rat";
        String ss = "car";

        //System.out.println(isAnagram(s, ss));
    }
}
