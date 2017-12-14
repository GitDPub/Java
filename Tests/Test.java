package Tests;

class Test
{
    public static void main(String[] args)
    {
        int []a = {1,2,3,4,5,6};
        int i = a.length;
        while(i>=1)
        {
            System.out.print(a[i]);
            i--;
        }
    }
}

/**

What would be the output, if it is executed as a program?
 A. 123456
 B. 65432
 C. 12345
 D. An exception could be thrown at runtime.
 E. Compile error.

 D is correct.

 Length of array "a" is 6, so the value of the variable i is 6. Execution of while loop will try to
 print array element reverse as variable "i" has initial value 6 , So trying to access element with
 index position 6 will cause ArrayIndexOutOfBoundsException since the array positions start with0.
 Hence the correct option is D.

 Exam objective: Using Loop Constructs - Create and use while loops
 Creating and Using Arrays - Declare, instantiate, initialize and use a one-dimensional array

 */