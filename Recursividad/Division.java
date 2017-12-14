package Recursividad;

/**
 * Division por restas consecutivas.
 *
 */
public class Division
{

    public static void main(String[] args)
    {
        System.out.println("iterativamente: "+ Iter(10,2));
        System.out.println("recursivamente: "+ Recur(10,2));
    }

    private static int Recur(int endo, int sor)
    {
        if(endo <= sor)
            return 1;
        else
            return Recur(endo - sor, sor)+1;
    }

    private static int Iter(int endo, int sor)
    {
        int c=0;
        while (endo >= sor) {
            endo -= sor; c++;
        }
        return c;
    }

}
