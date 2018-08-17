package ThreadStudy;

public class ExtendsThread extends Thread{

    public ExtendsThread(String threadName){

        this.setName(threadName);
    }


    public void run() {

        int clientNumber = 1;
        while (clientNumber != 100) {
            System.out.println(this.getName()+ " sends data to client..." + clientNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clientNumber++;
        }
    }
}
