package threads;

class Type1 extends Thread
{
    public void run()
    {

    }
    public static void main(String [] args)
    {
        Thread t1 = new Thread();
        t1.start();
    }
}