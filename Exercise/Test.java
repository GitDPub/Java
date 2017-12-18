package Exercise;

import java.util.*;
import java.io.*;

class Test {
    /**
     *
     */
    public static boolean sum_is_possible(ArrayList<Integer> A, int S) {
        // TODO: ...
        Collections.sort(A);
        int i = 0;
        int j = A.size() - 1;
        for(int k = A.size() - 1; A.get(k) > S; k--) {
            j = k;
        }
        while(i != j) {
            int sum = A.get(i) + A.get(j);
            if (sum == S) {
                return true;
            }
            if (sum > S) {
                j--;
            }
            if (sum < S) {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        int S = 7;
        // A = [4 5 -1 3 6 2]
        // S = 7
        //

        // TODO: test numbers
        A.add(4); A.add(5); A.add(-1); A.add(3); A.add(6); A.add(2);
        System.out.println(sum_is_possible(A, S));
    }
}
