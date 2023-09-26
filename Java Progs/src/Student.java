class Child{
    int rollNo=69;
    String studentName="saqlain";
}
public class Student {
    public static void main(String[] args) {
        //that's the syntax for making object in java with the name of the class
        Child obj1 = new Child();
//        Child obj2 = new Child();
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);
        //changing the name of methods mentioned above
        obj1.rollNo=79;
        obj1.studentName="shahid";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);
    }
}
