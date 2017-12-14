package Recursividad;

public class Factorial
{

    public static void main(String[] args)
    {
        System.out.println("iterativamente: "+normal(3));
        System.out.println("recursivamente: "+fact(3));
    }

    private static int normal(int n){
        int f=1;
        for(int a=n;a>0;a--)
            f*=a;
        return f;
    }

    private static int fact(int n){
        if(n==0)
            return 1;
        else
            return fact(n-1)*n;
    }

}
