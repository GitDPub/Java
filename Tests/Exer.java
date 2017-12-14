package Tests;

class Exer
{
    public static void main(String [] args)
    {
        String s = "Java";
        s.concat(" SE 7");
        s.replaceAll("7","");
        System.out.print(s);
    }
}

/**

 What is the result?
 A. Java SE ""
 B. Java SE 7
 C. Java SE
 D. Java.
 E. Compilation fails.

 D is correct.
 Line 7 String s = "Java"; create a new String object and gives it the value "Java".
 Line 8 s.concat(" SE 7"); and 9 s.replaceAll("7",""); modified the String "java"
 but there is no reference used to refer that modified objects. So it really creates
 two useless String objects. So at the end s stays as "Java".
 So the A, B and C are incorrect as the "String s" remains unchanged as explained above.
 Exam objective:  Working With Java Data Types - Create and manipulate strings

 To use concat and replaceAll:
 String s = "Java";
 s = s.concat(" SE 7");
 s = s.replaceAll("7","");

output would be:
Java SE

 */


