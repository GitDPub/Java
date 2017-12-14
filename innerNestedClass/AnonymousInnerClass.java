/*****************************************

 Inner Classes
 (Non-static Nested Classes)
 Method-local Inner Class

 An inner class declared without a class name is
 known as an anonymous inner class.
 In case of anonymous inner classes, we declare and
 instantiate them at the same time.
 Generally, they are used whenever you need to override
 the method of a class or an interface.

*****************************************/

package innerNestedClass;

abstract class AnonymousInnerClass
{
    public abstract void myMethod();
}



//Now it is needed to override the method of a class
// using anonymous inner class.
class ImplementAnonymous
{
    public static void main(String[] args)
    {
        AnonymousInnerClass object = new AnonymousInnerClass()
        {
            public void myMethod()
            {
                System.out.println("Example of anonymous inner class");
            }
        };
        object.myMethod();
    }
}






