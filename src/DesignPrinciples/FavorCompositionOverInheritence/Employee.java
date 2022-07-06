package DesignPrinciples.FavorCompositionOverInheritence;

public class Employee {

    private String Title;
    Person Person;

    public Employee(String title, Person person) {
        Title = title;
        Person = person;
    }

    @Override
    public String toString() {
        return "" +
                "title='" + Title + '\'' +
                "Name='" + Person.Name + '\'' +
                "Age='" + Person.Age + '\'' +
                "";
    }
}