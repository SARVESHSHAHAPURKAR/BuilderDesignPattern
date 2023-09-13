package Model;

import java.util.List;

public class Student {

    int rollNumber;

    String name;

    int age;

    List<String> subjects;

    String mothersName;

    String fathersName;

    //StudentBuilder studentBuilder;

    public Student(StudentBuilder studentBuilder) {

        this.rollNumber = studentBuilder.rollNumber;
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.subjects = studentBuilder.subjects;
        this.mothersName = studentBuilder.mothersName;
        this.fathersName = studentBuilder.fathersName;


    }

    @Override
    public String toString(){

        String s = "";
        s+= this.rollNumber+" "+this.name+" "+age+" ";

        for(String subject : this.subjects){
            s += subject+" ";
        }

        return s;
    }
}
