package polymorphism.demo;

public class User {
    public void printUserType() {
        System.out.println("User");
    }

    public void saveWebLink() {
        System.out.println("User: saveWebLink");
        postAReview();
    }

    public void postAReview() {
        System.out.println("User: postAReview");
    }

    /*public void approveReview() {
        System.out.println("User: approveReview");
    }*/
}

/*
saveWebLink here is called from main as its the the first method with that name found starting from Editor class, then
checking Staff class as Editor extends Staff.

postAReview is also called in saveWebLink which calls that method from Staff class as even this starts searching from
Editor upwards.
 */
