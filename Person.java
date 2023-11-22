import java.util.ArrayList;
import java.util.List;

public class Person extends Nameable {
    int id;
    String name = "unknown";
    int age;
    boolean parent_permission = true;

    public Person(String name, int age, boolean parent_permission) {
        this.name = name;
        this.age = age;
        this.parent_permission = parent_permission;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean of_age() {
        return age >= 18;
    }
    public boolean can_use_services(){
        return(of_age () || parent_permission );
    }
}
    @Override
    public String getCorrectName() {
        return name;
    }
    List<Rental> rentals = new ArrayList<>();
    public void addRental(Rental rental) {
        rentals.add(rental);
    }


    public List<Rental> getRentals() {
        return rentals;
    }
}
