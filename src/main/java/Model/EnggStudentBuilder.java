package Model;

import java.util.ArrayList;
import java.util.List;

public class EnggStudentBuilder extends StudentBuilder{


    @Override
    public StudentBuilder setSubjects() {

        List<String> subjects = new ArrayList<>();

        subjects.add("OS");
        subjects.add("DSA");

        this.subjects = subjects;
        return this;
    }
}
