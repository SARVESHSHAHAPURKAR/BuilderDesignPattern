package Model;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {

        List<String> subjects = new ArrayList<>();
        subjects.add("Management");
        subjects.add("Finance");

        this.subjects = subjects;

        return this;
    }
}
