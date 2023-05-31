package entities;

import java.util.ArrayList;
import java.util.List;

public class Courses {
    private List<Integer> students = new ArrayList<>();

    public Courses(Integer student) {
        students.add(student);
    } 

    public void addStudents(Integer student) {
        students.add(student);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((students == null) ? 0 : students.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Courses other = (Courses) obj;
        if (students == null) {
            if (other.students != null)
                return false;
        } else if (!students.equals(other.students))
            return false;
        return true;
    }
}