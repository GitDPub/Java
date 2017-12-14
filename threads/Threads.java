package threads;
import java.util.concurrent.Callable;
import java.util.concurrent.*;

public class Threads
{
    public static void main(String[] args) {
        try
        {
            ExecutorService servicio= Executors.newFixedThreadPool(1);
            Future<Integer> resultado= servicio.submit(new Type());
            if(resultado.isDone())
            {
                System.out.println(resultado.get());
            }
        }
        catch (InterruptedException | ExecutionException e)
        {
            e.printStackTrace();
        }
    }
}

class Type implements Callable<Integer>
{
    public Integer call() throws Exception
    {
        int total = 0;
        for(int i=0;i<5;i++)
        {
            total+=i;
            try
            {
                Thread.sleep(300);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName());
        return total;
    }

}
