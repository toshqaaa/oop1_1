public class Main {
    public static void main(String[] args) {
        Person first = new Person("Иванов Иван Иванович");
        Person second = new Person("Петров Петр Петрович");
        Person third = new Person("Васильев Василий Васильевич");

        first.appendToFamily(second);
        first.appendToFamily(third);

        first.appendToFamily(null);

        first.appendToFamily(first);

        second.appendToFamily(third);
        view(first);
    }

    static void view(Person rootPerson) {
        System.out.println(rootPerson.getName());
        for (Person person : rootPerson.getFamily()) {
            view(person);
        }
    }
}

// Описать генеалогическое дерево
