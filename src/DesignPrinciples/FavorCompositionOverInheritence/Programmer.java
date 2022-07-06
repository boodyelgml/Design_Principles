package DesignPrinciples.FavorCompositionOverInheritence;

import java.util.ArrayList;
import java.util.List;

public class Programmer {
    private String Grade;
    private String Section;
    public List<String> Benfits = new ArrayList<>();
    public Employee Employee;

    public void addToBenfits(String benfit) {
        Benfits.add(benfit);
    }

    public Programmer(String grade,String section, Employee employee) {
        Grade = grade;
        Section = section;
        Employee = employee;
    }

    @Override
    public String toString() {
        return Employee + " || " +
                "Grade='" + Grade + '\'' +
                "Section='" + Section + '\'' +
                ", Benfits=" + Benfits +
                '.';
    }
}
