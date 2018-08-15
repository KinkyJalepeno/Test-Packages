package StartingThreads;

public class HelloThread2 implements Runnable{

    public static void main(String[] args) {

        HelloThread2 runnable = new HelloThread2();
        Thread thread = new Thread(runnable);
        thread.start();

    }

    @Override
    public void run() {
        System.out.println("Hello from a thread");
    }
}

// The way uses the "implements Runnable" call on the class
