package innerNestedClass;

/**
 Anonymous Inner Class as Argument

 Generally, if a method accepts an object of an interface,
 an abstract class, or a concrete class, then we can implement
 the interface, extend the abstract class, and pass the object
 to the method. If it is a class, then we can directly pass it
 to the method.

 But in all the three cases, you can pass an anonymous inner
 class to the method.
*/

interface AnonymousInnerClassAsArgument
{
    String greet();
}

class MyClass
{
    public void displayMessage(AnonymousInnerClassAsArgument m)
    {
        System.out.println(m.greet() + "anonymous inner class");
    }

    public static void main(String[] args)
    {
        MyClass obj = new MyClass();
        obj.displayMessage(new AnonymousInnerClassAsArgument() {
            @Override
            public String greet()
            {
                return "";
            }
        });
    }

}