package Tests;

class Program
{
static Integer i;

    public static void main(String [] args){
    try{
        System.out.println(i.compareTo(0));
    }
    catch ( ArithmeticException | NullPointerException e)
    {
        System.out.println("Exception");
    }
    }
}


/**
 Which is the output?
 A. -1
 B. 0
 C. 1
 D. Exception
 E. Compilation fails.

 Option D is correct.
 From java se 8, we can use catch box for multi exceptions so this code compiles fine.
 In given catch box it can catch both  ArithmeticException and NullPointerException.
 At line 9 System.out.println(i.compareTo(0));
 a NullPointerException will be thrown since i is not initialized. Hence option D is correct.

 Exam objective : Handling Exceptions - Create a try-catch block and determine how exceptions alter normal program flow
 */