//the teacher class
class Teacher extends Person {
 
     String specialization;

    public Teacher( String name, int age, String specialization) {
        super( name, age,true);
        this.specialization = specialization;
    }

@Override
    public boolean can_use_services() {
        return true;
    }
}
