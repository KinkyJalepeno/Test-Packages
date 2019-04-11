package polymorphism.demo;

public class UserTest {
    public void printUserType(User u) {
        u.printUserType();
    }

    public static void main(String[] args) {

        User user = new User();
        User staff = new Staff();
        User editor = new Editor();

        UserTest ut = new UserTest();
        ut.printUserType(user);
        ut.printUserType(staff);
        ut.printUserType(editor);
        /* polymorphism allows is to pass different object references to same method.  User, Staff and Editor all passed
        to printUserType() method.*/


        //((Editor)editor).approveReview(); //works using explicit casting
        //editor.approveReview();
        editor.postAReview();
        editor.saveWebLink();
    }
}

/*
User editor = new Editor();  // I am instantiating an object of the User class which does not contain an approveReview()
method, so a method of that name cannot be called in the Editor class.  In order to do so I first need to define one
in the User class as it is the "Super Class", this will make it inherited down the chain and able to be called.
Alternatively we can use "explicit casting - ((Editor)editor).approveReview();
 */
