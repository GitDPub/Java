package InterfaceAbstract;

public class InterfaceJava8 implements Interface1, Interface2
{
    @Override
    public void empty()
    {

    }
    @Override
    public void log(String s)
    {

    }
}

interface Interface1
{
    void empty();

    default void log(String s)
    {
        System.out.println("1) logs: "+s);
    }
}

interface Interface2
{
    void empty();

    default void log(String s)
    {
        System.out.println("2) logs: "+s);
    }
}