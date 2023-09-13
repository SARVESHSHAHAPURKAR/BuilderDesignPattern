package Model;

public class Director {

    public StudentBuilder builder;

    public Director(StudentBuilder builder) {
        this.builder = builder;
    }

    public Student createStudent(){

        if(builder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        if(builder instanceof EnggStudentBuilder){
            return createEnggStudent();
        }

        return null;
    }

    private Student createEnggStudent() {

        return builder.setRollNumber(1).setAge(22).setName("sj").setSubjects().build();

    }

    private Student createMBAStudent() {

        return builder.setRollNumber(2).setAge(25).setName("xyz").setSubjects().build();
    }
}
