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
User editor = new Editor();  // I am creating an object of the Editor class, with the reference type of User.
So, what is on the left is the reference type, while the right-side of assignment defines the actual type of object.
Reference type simply dictates what methods we can access, but the object itself is still an Editor object.

Alternatively we can use "explicit casting - ((Editor)editor).approveReview();
 */
