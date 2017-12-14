package threads;

//this class creates a thread by extending java.lang.thread
public class ThreadThread extends Thread
{
    //method where the thread execution starts
    static String theHilo="";

    public void run()
    {
        //logic to execute in thread
        counter(5);
//        System.out.println("Hilo: "+Thread.currentThread().getName());
//      System.out.println(String.format("execute thread: %s %s", Thread.currentThread().getName(), this.getName()));
    }

    public static void main(String [] args)
    {
        Thread t1 = new ThreadThread();
        Thread t2 = new ThreadThread();

        t1.start(); //starts the 1st thread, this calls the run() method.
        wait(3000);
        t2.start(); //starts the 2nd thread, this calls the run() method.
    }


    private static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    private static void counter(int secs)
    {
        for (int i=1;i<=secs;++i)
        {
            theHilo=""+Thread.currentThread().getName();
            System.out.println(theHilo+"   second: "+i);
            wait(1000);
        }
    }

}
