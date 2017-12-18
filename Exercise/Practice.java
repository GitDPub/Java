package Exercise;

import java.util.Arrays;

public class Practice
{
    public static void main(String[] args) {
        int s=16;
//        int a[]={-8, 1, 4, 6, 10, 45};
        int a[] = {2,6,1,8,3,4,12,11};
        int l = a.length-1;
        int i = 0;
        Arrays.sort(a);
        while(i<l) {
            if(a[i] + a[l] == s && a[i] != a[l])
                break;
            if(a[i] + a[l] < s)
                ++i;
            if(a[i] + a[l] > s)
                --l;
        }
        System.out.println(a[i] +" + "+ a[l] +" = "+s);
    }
}
