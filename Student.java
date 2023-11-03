public class Student extends Person{
    public int getClassroom() {
        return classroom;
    }
    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    private int classroom;

    public Student(String name,int age,boolean parent_permission, int classroom) {
        super(name, age,parent_permission);
        this.classroom = classroom;
    }

}




