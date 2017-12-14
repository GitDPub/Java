package InterfaceAbstract;

abstract class RunAbstract
{
    int a;
    int b;

    RunAbstract(int a, int b)
    {
        this.a=a;
        this.b=b;
    }

    public static void Hi()
    {
        System.out.println("Hi");
    }

    public static void main(String[] args)
    {
        Hi();
    }

}
