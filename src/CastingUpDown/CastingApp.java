package CastingUpDown;

public class CastingApp {

    public static void main(String[] args) {

        Machine m1 = new Machine();
        Camera c1 = new Camera();

        // these method calls are normal and don't involve casting
        m1.start();
        c1.start();
        c1.snap();

        // Upcasting
        Machine m2 = c1;
        // this will trigger the start method in the Camera class as the start() method in machine is over-ridden by
        // Camera's own version
        m2.start();

        // this will not work as there is no snap() method defined in Machine class which is where Downcasting comes in
        // m2.snap();

        //Downcasting the quick way without creating another object
        ((Camera) m2).snap();

        //Downcasting from object creation
        Machine m3 = new Camera();
        Camera c2 = (Camera)m3;
        c2.snap();


    }

}

class Machine{

    public void start() {

        System.out.println("Machine has started");
    }
}






class Camera extends Machine {

    public void start() {
        System.out.println("Camera started");
    }

    public void snap() {

        System.out.println("Picture taken");
    }

}