package TidyConnection;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.launchConnection();

    }

    private void launchConnection() {

        DBConnection connection = new DBConnection();
        connection.launch();
    }

}
