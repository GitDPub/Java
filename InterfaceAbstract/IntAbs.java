package InterfaceAbstract;

public class IntAbs
{

}


abstract class Abs
{
    int a;
    int b=0;
    abstract void Method();
    void Method2()
    {
        System.out.println("hi");
    }
}

interface Int
{
    int c=3;
    int d=4;
    int e=5;
    void Methoded1();
    abstract void Methoded2();
}