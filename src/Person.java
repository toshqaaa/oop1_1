import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Person> family = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Person> getFamily() {
        return family;
    }

    public void appendToFamily(Person person) {
        if (person != null && person != this) {
            family.add(person);
        }
    }

    @Override
    public String toString() {
        return getName();
    }
}
