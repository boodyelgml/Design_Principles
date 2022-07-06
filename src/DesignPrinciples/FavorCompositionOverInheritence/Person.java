package DesignPrinciples.FavorCompositionOverInheritence;

// favor composition over inheritance //
// is a design principle that gives the design higher flexibility.
// It is more natural to build business-domain classes out of various components than trying to find commonality between them and creating a family tree.

// #Example
// Think of containment as a has a relationship. A car "has an" engine, a person "has a" name, etc.
// Think of inheritance as an is a relationship. A car "is a" vehicle, a person "is a" mammal, etc.

public class Person {
    public String Name;
    public String Age;

    public Person(String name, String age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }


}