package Inheritence;

public class PhysicsTeacher {
    String mainSubject = "Physics";

    public static void main(String args[]){
        Teacher obj = new Teacher();

        System.out.println(obj.mainSubject);
        System.out.println(obj.designation);
        System.out.println(obj.collegeName);
        obj.does();
    }
}


class Teacher extends PhysicsTeacher{

    String designation = "Teacher";
    String collegeName = "Beginnersbook";

    void does(){
        System.out.println("Teaching");
    }

}