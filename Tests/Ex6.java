package Tests;

class Ex6{
    public static void main(String args[]){
     	int i = 0, j=10;
    	try{
			j /=i;
        }
//        System.out.print("Divide by Zero! ");
        catch(Exception e){
            System.out.print("error");
        }
        }
}

/**
What is the output?

A. 0
B. 0 Divide by Zero!
C. Divide by Zero! Error
D. Error
E. Compilation fails.
F. An uncaught exception is thrown at runtime.

Option E is correct.
You can not enter code between try and catch clause. Here line 9 causes the failure.
So the answer is E, if you remove line 7 then code will compile fine and provide output as error
so in that case answer would be D.

Exam objective:  Handling Exceptions - Create a try-catch block and determine how exceptions alter normal program flow
*/