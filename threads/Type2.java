package threads;

class Type2 implements Runnable
{
    public void run()
    {

    }
    public static void main(String args[])
    {
        ThreadRunnable object = new ThreadRunnable();
        Thread T1 = new Thread(object);
        T1.start();
    }
}