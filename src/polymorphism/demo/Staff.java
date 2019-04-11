package polymorphism.demo;

public class Staff extends User {
    public void printUserType() {
        System.out.println("Staff");
    }

    public void postAReview() {
        System.out.println("Staff: postAReview");
    }
}

/*
postAReview here is called from main as its the first method found starting from Editor class
 */
