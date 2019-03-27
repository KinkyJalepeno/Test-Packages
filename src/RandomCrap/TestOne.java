package RandomCrap;


public class TestOne {

    static Boolean scoopDown = false;

    public static void main(String[] args) {

        // print out current state of boolean
        System.out.println(scoopDown);

        // now flip the boolean
        scoopDown = !scoopDown;
        System.out.println(scoopDown);

        // now flip it back
        scoopDown = !scoopDown;
        System.out.println(scoopDown);

        if (!scoopDown) {

            System.out.println("The Cargo Scoop is up");
        } else {
            System.out.println("the scoop is down");
        }

    }
}
