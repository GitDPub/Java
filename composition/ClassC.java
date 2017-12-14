package composition;

public class ClassC
{
    SuperClass obj = null;

    public ClassC(SuperClass o)
    {
        this.obj = o;
    }

    public void test()
    {
        obj.doSomething();
    }

    public static void main(String[] args)
    {
        ClassC obj1 = new ClassC(new ClassA());
        ClassC obj2 = new ClassC(new ClassB());
    }
}