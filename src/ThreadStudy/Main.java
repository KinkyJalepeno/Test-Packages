package ThreadStudy;

public class Main {

    public static void main(String[] args) {

        ExtendsThread thread = new ExtendsThread("Server 1");
        ExtendsThread thread2 = new ExtendsThread("Server 2");

        thread2.setPriority(Thread.MAX_PRIORITY);  //sets max priority of 10

        System.out.println(thread2.getName() + " Priority: " + thread2.getPriority());

        thread.start();
        thread2.start();

        ImplementRunnable runnable1 = new ImplementRunnable("Server 3");
        Thread thread3 = new Thread(runnable1);
        thread3.start();

        ImplementRunnable runnable2 = new ImplementRunnable("server 4");
        runnable2.start(); // this way of starting a runnable requires a start method in the runnable class.

    }

}
