package StartingThreads;

public class HelloThread extends Thread{

    public static void main(String[] args) {

        HelloThread thread = new HelloThread();
        thread.start();
    }

    @Override
    public void run(){
        System.out.println("Hello from a thread");

    }
}


// This way uses the "extend Thread" method of starting a thread.
