package threads;

//Thread in java using the implementation of the java.lang.Runnable Interface
public class ThreadRunnable implements Runnable{

//    @Override
    public void run(){
        //implementation of run method here.
    }

    public static void main(String [] args){
        final ThreadRunnable obj = new ThreadRunnable();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(new ThreadRunnable());
    }

}
