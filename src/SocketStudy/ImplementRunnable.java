package SocketStudy;

public class ImplementRunnable implements Runnable{


    private String name;

    public ImplementRunnable(String serverName){

        this.name = serverName;
    }

    @Override
    public void run() {

        int clientNumber = 1;
        while (clientNumber != 100) {
            System.out.println(getName()+ " sends data to client..." + clientNumber);

            try {
                Thread.sleep(1000);  //Sleeping a thread required a try/catch block
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clientNumber++;
        }

    }

    private String getName(){

        return name;
    }

    public void start() {

        Thread thread = new Thread(this);
        thread.start();
    }
}
