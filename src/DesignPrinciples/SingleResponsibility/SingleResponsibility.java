package DesignPrinciples.SingleResponsibility;

public class SingleResponsibility {
    //  The idea behind the SRP is that every class, module, or function in a program should have
    //  one responsibility/purpose in a program. As a commonly used definition,
    //  "every class should have only one reason to change"
}

// Bad code
class student {
    private String firstName;
    private String lastName;
    private int age;

    public Long calculateFee() {
        return null;
    }

    public void StudnetPersister() {}

    public String reportAttendance() {
        return "";
    }

}

// Good code
class Student {
    private String firstName;
    private String lastName;
    private int age;
}

class FeeCalculator {
    public long calculateFee(Student s) {
        // fee calculation logic
        return 1L;
    }
}

class AttendanceCalculator {
    public String reportAttendance(Student s) {
        return null;
    }
}

class StudnetPersister {
    public void save(Student s) {
        // save student object to DB/File
    }
}