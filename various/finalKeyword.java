package various;

public final class finalKeyword
{
    public static void main(String[] args)
    {
        System.out.println("Other classes can not extend this class");

        ClassA objA = new ClassA();
        ClassA objB = new ClassB();
        objA.msg();
        objB.msg();
    }
}

class ClassA
{
    public final void msg()
    {
        System.out.println("This class cannot be overridden");
    }
}

class ClassB extends ClassA
{

}



