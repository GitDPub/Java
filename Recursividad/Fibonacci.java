package Recursividad;

public class Fibonacci
{

    public static void main(String[] args) {
        System.out.println("0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, ");
        iterativaSerie(7);
        System.out.println();
        System.out.println("-solo un numero de la serie-"+iterativa(7));
        System.out.println();
        System.out.println("-solo un numero de la serie-"+recursiva(7));
    }


    private static int recursiva(int n) {
//        if(n==2 || n==1)
        if(n==2 || n==3)
            return 1;
        else
            return recursiva(n - 1) + recursiva(n - 2);
    }

    private static int iterativa(int n)
    {
        int a=0;
        int b=1;
        int t;
        for(int i=1;i<n;i++){
            t=a; a=b; b+=t;
        }
        return a;
    }


    private static void iterativaSerie(int n)
    {
        int a=0;
        int b=1;
        int t;
        for(int i=1;i<=n;i++){
            System.out.print(a+", ");
            t=a;
            a=b;
            b+=t;
        }
    }

}
