package StaticStuff;

public class App {

    public static void main(String[] args) {

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "dave";
        thing2.name = "Bev";

        System.out.println("thing1 = " + thing1.name);
        System.out.println("thing2 = " + thing2.name);

        // I have accessed the non static variable name by calling instance of the class "Thing"
        // To access description variable you call it direct as a static method belong's to the base class.

        Thing.description = "I am a sexy thing";
        System.out.println(Thing.description);

        thing1.showName();
        thing2.showName();

        Thing.showInfo();  // you are calling the class directly, not instantiating an instance of the class.


    }

}

class Thing{

    public String name;
    public static String description;

    // instances of a class can access both static and instance variables
    public void showName(){

        System.out.println(description + " : " + name);
        //both the contents of description and name will be displayed
    }

    // non static variables (instance) cannot be accessed from a static variable
    public static void showInfo(){
        System.out.println(description);
        // System.out.println(name);  this cannot work as "name" is an instanced (non-static) variable

    }

}
