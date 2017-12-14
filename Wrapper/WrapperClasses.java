/**
 *
 * Wrapper class in java are the Object representation of eight
 * primitive types in java. All the wrapper classes in java are
 * immutable and final. Java 5 autoboxing and unboxing allows
 * easy conversion between primitive types and their corresponding
 * wrapper classes in java programs.
 *
 * Wrapper classes are used when it is needed a type that will fit
 * in the Object world programming like Collection classes.
 * Primitive types are used when it is needed to have things to be simple.
 *
 */

package Wrapper;

import java.util.List;
import java.util.ArrayList;

public class WrapperClasses
{
    private static void doSomething(Object obj)
    {

    }

    public static void main(String args[])
    {
        int i = 10;
        char c = 'a';

        //primitives are simple to use
        int j = i+3;

        //polymorphism achieved by Wrapper classes, we can't pass primitive here
        doSomething(new Character(c));

        List<Integer> list = new ArrayList<Integer>();
        //wrapper classes can be used in Collections
        Integer in = new Integer(i);
        list.add(in);

        //autoboxing takes care of primitive to wrapper class conversion
        list.add(j);

        //wrapper classes can be null
        in = null;
    }
}