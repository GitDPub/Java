package InterfaceAbstract;
/**
 *
 * Java interface static method is similar to default method except
 * that it can't be overridden in the implementation classes.
 * This feature helps to avoid undesired results in case
 * of poor implementation in implementation classes.
 *
 */
public class InterfaceStaticMethod implements StaticMethod
{
    public boolean isNull(String str)
    {
        System.out.println("Impl Null Check");
        return str == null ? true : false;
    }

    public static void main(String args[])
    {
        InterfaceStaticMethod obj = new InterfaceStaticMethod();
        obj.print("");
        obj.isNull("abc");
    }
}

interface StaticMethod
{
    default void print(String str)
    {
        if (!isNull(str))
            System.out.println("MyData Print::" + str);
    }

    static boolean isNull(String str)
    {
        System.out.println("Interface Null Check");

        return str == null ? true : "".equals(str) ? true : false;
    }
}