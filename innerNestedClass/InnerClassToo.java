/*****************************************

Inner Classes
(Non-static Nested Classes)
inner class
Accessing the Private Members

*****************************************/

package innerNestedClass;

public class InnerClassToo
{
    public static void main(String[] args)
    {
        //Instantiating the outer class
        Out objOutClass = new Out();
        // Instantiating the inner class
        Out.In objInClass = objOutClass.new In();
        System.out.println(""+objInClass.getNum());
    }
}

class Out
{
    private int number = 175;
    public class In
    {
        public int getNum()
        {
            System.out.println("method of inner class getNum()");
            return number;
        }
    }
}
