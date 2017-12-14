package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1
{
//    List libre1 = new ArrayList();
//    ArrayList libre2 = new ArrayList();
//    ArrayList<String> listaString2 = new ArrayList<String>();

    public static void main(String[] args)
    {
        List<String> ls1 = new ArrayList<String>();
        ls1.add("zero");
        ls1.add("one");
        ls1.add("two");
        ls1.add("three");
        System.out.println("* Tamaño de la lista: "+ ls1.size());
        System.out.println("* Contenido: ");
        if(!ls1.isEmpty())
        {
            showAll(ls1);
        }
        ls1.clear();
    }

    private static void showAll(List<String> lista)
    {
        for (String item:lista)
        {
            System.out.println(""+item);
        }
    }

    private static void showAllToo(List<String> lista)
    {
        Iterator i = lista.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }


}
