package Static;

public class Static
{

    static int a=1;
    static int b=2;
    static int c=3;
    int d=4;
    int e=5;

    static void methodA()
    {
        System.out.println("only static variables and methods in the same class are used: ");
        System.out.println("- "+a);
        System.out.println("- "+b);
        System.out.println("- "+c);
        methodB();
    }

    static void methodB()
    {
        System.out.println("hi this is method B");
    }

    private void methodC()
    {
        System.out.println("method C can use static methods and variables");
        methodB();
        methodD();
    }

    private void methodD()
    {
        System.out.println("method D");
    }

    public static void main(String[] args)
    {

    }

}
