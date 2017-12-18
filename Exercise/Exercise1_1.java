package Exercise;

import java.util.Arrays;

public class Exercise1_1
{
    public static void main(String[] args)
    {
        int suma =16;
        int a[] = {-8, 1, 4, 6, 10, 45};
        int l = a.length - 1;
        int i = 0;
        Arrays.sort(a);
        while(i<l){
            if(a[i]+a[l]== suma){
                System.out.println(a[i]+"+"+a[l]+"=16");
                break;
            }
            else if(a[i]+a[l]<suma)
                i++;
            else if(a[i]+a[l]>suma)
                l--;
        }
    }
}
