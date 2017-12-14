/*****************************************

Inner Classes
(Non-static Nested Classes)
inner class

*****************************************/
package innerNestedClass;

public class InnerClass
{
    public static void main(String[] args)
    {
        Outer outerObj = new Outer();
        outerObj.display();
    }
}

class Outer
{
    int num;
    class Inner
    {
        public void print()
        {
            System.out.println("This is a method of an inner class");
        }
    }
    // access to a inner from a method inside the class
    void display()
    {
        Inner innerObj = new Inner();
        innerObj.print();
    }
}