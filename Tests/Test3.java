package Tests;

class Test3
{
    int value = 10;
    public static void main(String[] args)
    {
        new Test3  ().print();
    }
    public void print()
    {
        int value = 8;
        System.out.print(value);
    }
}

/**
 *
 Which is the output?
 A. 8
 B. 10.
 C. Compilation fails due to error at line 8 new Test3  ().print();
 D. Compilation fails due to error at line 7 int value = 8;

 A is correct.
 Inside a class method, when a local variable have the same name as one of the instance
 variable, the local variable shadows the instance variable inside the method block.
 So the value of "a" (8) in method print() can see as the output. So the answer is A.
 B is incorrect as the instance variable is shadowed by the variable in the method print().
 The code compiles fine, hence C and D are incorrect.

 Exam objective:  Java Basics - Define the scope of variables
 *
 */