package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Tester
{
    public static void main(String[] args)
    {
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();

        String in="";
//        Scanner intro = new Scanner (System.in);
//        in = intro.nextLine ();
        listOfNumbers.add(2);
        listOfNumbers.add(9);
        listOfNumbers.add(5);
        listOfNumbers.add(4);
        listOfNumbers.add(12);
        listOfNumbers.add(10);
        listOfNumbers.add(1);

        Collections.sort(listOfNumbers);

        int total = 16;

        AbstractCreator theObj = new Creator();

        Algos o1 = theObj.creates(1);
        Algos o2 = theObj.creates(2);

        o1.sumExits(listOfNumbers, total);
        o2.sumExits(listOfNumbers, total);
    }
}

interface Algos
{
    String sumExits(ArrayList<Integer> list,int sum);
}

class Sorted implements Algos
{
    @Override
    public String sumExits(ArrayList<Integer> list, int sum)
    {
        int i=0;
        int l=list.size()-1;
        String s="sum does not exits . . . ";
        while(i<l){
            if(list.get(i)+list.get(l)==sum)
                return ""+list.get(i)+" + "+list.get(l)+" = "+sum;
            if(list.get(i)+list.get(l)<sum)
                i++;
            if(list.get(i)+list.get(l)>sum)
                l--;
        }
        return s;
    }
}

class NotSorted implements Algos
{
    @Override
    public String sumExits(ArrayList<Integer> list, int sum)
    {
        return "good solution . . . ";
    }
}

abstract class AbstractCreator
{
    abstract Algos creates(int op);
}

class Creator extends AbstractCreator
{
    @Override
    Algos creates(int op)
    {
        Algos obj = null;
        switch(op)
        {
            case 1:
                obj= new Sorted();
                break;
            case 2:
                obj= new NotSorted();
                break;
        }
        return obj;
    }
}

class UnitTest
{
    String expected = "";
    String obtained = "";

    @Test
    public void sumExtisTest() throws Exception
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(16);
        list.add(1);

        expected = "4 + 12 = 16";
        obtained = new Sorted().sumExits(list,16);

        assertEquals(expected,obtained);
    }
}

