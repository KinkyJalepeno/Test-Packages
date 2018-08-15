package StaticVPublic;

class Thing{

    public String name;
    public static String desc;

    public void getName(){

        System.out.println("name = " + name);
    }

    public static void showDesc(){

        System.out.println("I am a static method");
    }
}

public class MyApp {

    public static void main(String[] args) {

        // static variables belong to their class and can only be one of them, you cannot make multiple objects
        Thing.desc = "I am a thing";
        System.out.println(Thing.desc);

        // non static variables can have multiple copies containing different values
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Dave";
        thing2.name = "Bev";

        thing1.getName();
        thing2.getName();

        Thing.showDesc();

        // someThing(); won't work because main is static but someThing method is not.

    }

    public void someThing(){

        Thing.showDesc();
        // thing1.getName(); won't work because thing1 belongs to an object that has not been created yet, not a class



    }

}
