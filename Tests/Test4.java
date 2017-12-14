package Tests;

class Test4
{
static int x = 0;
    public static void main(String[] args)
    {
        for(int x=0;x<5;x++){	}
        System.out.print(x);
    }
}

/**
 *
Which is the output?
 A. 4
 B. 5
 C. 0
 D. Compilation fails.
 E. Runtime exception will be thrown.

 C is correct.
 The life of Variable x ends with the end of for loop as the scope of variable x limits within
 for loop. So the value of static variable will print. So the output will be 0. Hence the answer is C.
 A and B are incorrect as explained above.
 There is no reason to fail the compilation or to throw exception, so the C and E are incorrect.

 Exam objective:  Java Basics - Define the scope of variables
 *
 */