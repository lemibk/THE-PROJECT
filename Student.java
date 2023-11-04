public class Student extends Person{
   
    private int classroom;

    public Student(String name,int age,boolean parent_permission, int classroom) {
        super(name, age,parent_permission);
        this.classroom = classroom;
    }

}




