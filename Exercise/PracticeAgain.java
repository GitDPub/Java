package Exercise;

import java.util.*;

public class PracticeAgain
{
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(3);
        ar.add(4);
        ar.add(1);
        ar.add(2);
        ar.add(10);
        ar.add(12);
        find(ar, 16);
    }

    private static void find (ArrayList<Integer> List, int s){
        Collections.sort(List);
        int l=List.size()-1;
        int i=0;
        String st = "no sum";
        while(i<l){
            if(List.get(i) + List.get(l)==s){
                st=List.get(i) +"+"+ List.get(l)+"="+s;
                break;}
            if(List.get(i) + List.get(l) < s)
                i++;
            if(List.get(i) + List.get(l) > s)
                l--;
        }
        System.out.println(st);
    }
}
