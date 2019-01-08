package AbstractClasses;

public class Car extends Vehicle{


    @Override
    public void startEngine() {
        System.out.println("Car started ok");
    }

    @Override
    public void doSomething() {
        System.out.println("Checked mirror");
    }

    @Override
    public void shutDown() {
        System.out.println("Car turned off");
    }
}
