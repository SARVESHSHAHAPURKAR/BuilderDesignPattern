package Model;

import java.util.List;

public abstract class StudentBuilder {

    int rollNumber;

    String name;

    int age;

    List<String> subjects;

    String mothersName;

    String fathersName;

    public StudentBuilder setName(String name){
        this.name= name;
        return this;
    }

    public StudentBuilder setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }

   abstract public StudentBuilder setSubjects();

    public StudentBuilder setMothersName(String name){
        this.mothersName= name;
        return this;
    }

    public StudentBuilder setFathersName(String name){
        this.fathersName= name;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}
