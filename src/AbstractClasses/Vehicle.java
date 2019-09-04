package AbstractClasses;

public abstract class Vehicle {

    private int id;

    // just some standard setters and getters for ID
    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }


    // define some methods - this will force any child class to have them like an Interface

    public abstract void startEngine();
    public abstract void doSomething();
    public abstract void shutDown();

    void run(){

        startEngine();
        doSomething();
        shutDown();
    }

}
