package threads;

import java.util.concurrent.*;

class Type3 implements Callable<Integer>
{
    public Integer call() throws Exception
    {
        return (int)(Math.random()*10)+1;
    }
    public static void main(String [] args)
    {
        try
        {
            ExecutorService serviceObj = Executors.newFixedThreadPool(1);
            Future<Integer> resultObj = serviceObj.submit(new Type3());
            if(resultObj.isDone())
            {
                System.out.println(resultObj.get());
            }

        }
        catch (InterruptedException | ExecutionException e)
        {
            e.printStackTrace();
        }
    }
}