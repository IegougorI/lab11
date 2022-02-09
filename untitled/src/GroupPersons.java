import java.util.ArrayList;

public class GroupPersons extends Person implements Add2GroupPerson, Arrived2RailwayStation {
    private String name;
    public GroupPersons(String name) {
        super(name);
        this.name = name;
    }
    public GroupPersons(String name, Person person1, Person person2, Person person3,Person person4) {
        super(name);
        this.name = name;
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
    }

    private ArrayList persons = new ArrayList();

    public void add2groupPerson(Person person) {
        persons.add(person);
    }

    public void arrived2RailwayStation() {
        System.out.println(name+ " get off on railway station");
    } //в персон


}
