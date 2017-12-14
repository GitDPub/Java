package Override;

public class Child extends Parent
{

    public void message()
    {
        System.out.println("message of CHILD class");
    }

    public static void main(String[] args) {
     /* When Parent class reference refers to the parent class object
	 * then in this case overridden method (the method of parent class)
	 *  is called.
	 */
        Parent obj = new Parent();
        obj.message();

	/* When parent class reference refers to the child class object
	 * then the overriding method (method of child class) is called.
	 * This is called dynamic method dispatch and runtime polymorphism
	 */
        Parent obj2 = new Child();
        obj2.message();
    }

}