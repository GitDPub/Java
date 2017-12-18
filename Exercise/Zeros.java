package Exercise;

import java.util.*;

public class Zeros
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(2);
        ar.add(0);
        ar.add(3);
        ar.add(0);
        ar.add(0);
        ar.add(1);
        ar.add(5);

        Iterator<Integer> it = ar.iterator();
        while(it.hasNext()) {
            if (it.next() == 0)
                it.remove();
        }

        Iterator<Integer> ite = ar.iterator();
        while(ite.hasNext())
            System.out.println(ite.next());
    }
}
