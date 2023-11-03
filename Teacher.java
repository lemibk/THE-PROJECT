class Teacher extends Person {
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    private String specialization;

    public Teacher( String name, int age, String specialization) {
        super( name, age,true);
        this.specialization = specialization;
    }

@Override
    public boolean can_use_services() {
        return true;
    }
}