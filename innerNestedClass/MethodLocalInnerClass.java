/*****************************************

 Inner Classes
 (Non-static Nested Classes)
 Method-local Inner Class

*****************************************/
package innerNestedClass;

public class MethodLocalInnerClass
{
    void Method()
    {
        float pi = (float) 3.14159;
        class Inside
        {
            public void printer()
            {
                System.out.println("" + pi);
            }
        }
        Inside object = new Inside();
        object.printer();
    }
    public static void main(String[] args)
    {
        MethodLocalInnerClass object = new MethodLocalInnerClass();
        object.Method();
    }
}
