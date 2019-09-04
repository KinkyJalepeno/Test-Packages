package AbstractClasses;

public class Main {

    public static void main(String[] args) {

        Car fordEscort = new Car();
        fordEscort.setId(12);

        System.out.println("car1 = " + fordEscort.getId());

        // can call method in abstract class ok
        fordEscort.run();

        // can call abstract method on its own ok
        fordEscort.startEngine();


        MotorBike hondaCR7 = new MotorBike();
        hondaCR7.run();

    }



}

/* abstract classes make a stronger statement than an interface as any class can use one irrespective of what the class,
actually is, but here we are saying any car or motorbike instantiated will be a vehicle.  It's locked down in a more robust
way
*/

