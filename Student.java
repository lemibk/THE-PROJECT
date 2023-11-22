//the student class
public class Student extends Person{

     int classroom;

    public Student(String name,int age,boolean parent_permission, int classroom) {
        super(name, age,parent_permission);
        this.classroom1 = new Classroom(classroom);
    }
    public Classroom getClassroom1() {
        return classroom1;
    }

    public void setClassroom1(Classroom classroom1) {
        this.classroom1 = classroom1;
        this.classroom1 = classroom1;
        classroom1.addStudent(this);
    }

}




