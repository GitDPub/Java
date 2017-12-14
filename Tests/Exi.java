package Tests;

class Ex1
{
    public static void main(String[] args)
    {
        int a[] = { 1,2,053,4};
        int b[][] = { {1,2,4} , {2,2,1},{0,43,2}};
        System.out.print(a[3]==b[0][2] );
        System.out.print(" " + (a[2]==b[2][1]));

        System.out.println();
        System.out.print(a[2]);
        System.out.println();
        System.out.print(b[2][1]);
    }
}

/**
 * Which is the output?

 A. true  false
 B. false  false
 C. false true
 D. true true
 E. Compilation fails

 D is correct.
 Indexing of array elements begin with zero. So [1] refers to the second element of an array.
 So here a[3] refers to the fourth element of array a. Itâs value is 4 and we have assigned 4 to b[0][2].
 We have assigned octal value to a[2] so the value of element is 43 in decimals.
 And we have assigned 43 in decimal to b[2][1]. So both will print true.
 According to above reasons A, B and C are incorrect. E is incorrect as code compiles fine.

 Exam objective:	Creating and Using Arrays - Declare instantiate, initialize and use a one-dimensional array.
 Declare, instantiate, initialize and use multi-dimensional array
 */