package codewars.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AreTheyTheSame {

    public static void main(String[] args) {
        int[] a = {0, -14, 191, 161, 19, 144, 195, 1};
        int[] b = {1, 0, 196, 36481, 25921, 361, 20736, 38025};
        System.out.println(comp(a,b));
    }

    public static boolean comp(int[] a, int[] b) {
        List<Boolean> c = new ArrayList<>();
        List<Integer> aToList = Arrays.stream(a).boxed().collect(Collectors.toList());

        if (a == null || b == null || a.length != b.length) {
            return false;
        }

        if (a.length == 0 && b.length == 0) {
            return true;
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < aToList.size(); j++) {
                if(b[i] == aToList.get(j) * aToList.get(j)) {
                    c.add(true);
                    aToList.remove(j);
                    break; //arrays should have the same size, so there's no need to keep comparing once one value is found
                } else if (j == aToList.size()-1) { //if it reaches the end, then there's no match
                    c.add(false);
                }
            }
        }

        return c.stream().filter(bool -> bool == false).count() == 0;
    }
}
