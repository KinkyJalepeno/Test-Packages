package AbstractClasses;

public class MotorBike extends Vehicle {


    @Override
    public void startEngine() {
        System.out.println("Bike started ok");
    }

    @Override
    public void doSomething() {
        System.out.println("checked fuel");
    }

    @Override
    public void shutDown() {
        System.out.println("Bike engine off");
    }
}
