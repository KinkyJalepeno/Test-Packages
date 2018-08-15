package LamdaExpressions;

interface Contract {

    int execute();
}

public class LamdaExample{

    public static void main(String[] args) {

        Runner runner = new Runner();
        runner.run(() -> {

            System.out.println("line 1 of code block");
            System.out.println("Line 2 of code block");
            return 8;
            // if the sys.out expressions were not needed just pass the value () -> 8
        });
    }

    private static class Runner {

        public void run(Contract c){

            System.out.println("Hello from the run method");
            int value = c.execute();
            System.out.println("value = " + value);
        }


    }
}