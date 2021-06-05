package sef.FinalTasks.Activity_1;

public class Students extends Person {

    private String schoolName;

    public Students(String name, int age) {
        super(name, age);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String introducePerson() {
        return String.format("I study in university %d", schoolName);
    }
}