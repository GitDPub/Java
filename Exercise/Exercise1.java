package Exercise;

public class Exercise1
{
    public static void main(String[] args)
    {
        int a[] = {-8, 1, 4, 6, 10, 45};
        int l = a.length-1;

        String s="no values";
        boolean b=false;
        for(int i=l;i>=0 && b==false;i--)
        {
            for(int k=0;k<l;k++)
            {
                if(a[i]!=a[k] && a[i]+a[k]==16)
                {
                    s=""+a[i]+" + "+a[k]+" = 16";
                    b=true;
                }
            }
        }
        System.out.println(""+s);
    }
}
