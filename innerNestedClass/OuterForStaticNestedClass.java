package innerNestedClass;
/**
A static inner class is a nested class which is a
static member of the outer class. It can be accessed
without instantiating the outer class, using other static members.
Just like static members, a static nested class does not have
access to the instance variables and methods of the outer class.
*/

public class OuterForStaticNestedClass
{
    static class Nested_Demo
    {
        public void my_method()
        {
            System.out.println("This is my nested class");
        }
    }

    public void Method()
    {
        new Nested_Demo().my_method();
    }

    public static void main(String args[])
    {
        OuterForStaticNestedClass.Nested_Demo nestedObj;
        nestedObj = new OuterForStaticNestedClass.Nested_Demo();
        nestedObj.my_method();
    }
}
