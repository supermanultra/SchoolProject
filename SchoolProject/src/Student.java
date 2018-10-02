import java.util.ArrayList;

public class Student {

    //Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int uniqueNum) {
        this.studentNum = uniqueNum;
    }

    private String firstName; //First name of student
    private String lastName; //Last name of student
    private int grade; //Grade of student
    private static int uniqueNum = 1; //Used to set unique student ID number
    private int studentNum; //Student ID number


    //Constructs Student object with given parameters
    Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNum = uniqueNum;
        uniqueNum++;
    }

    //Sets print statement for Student objects to following format
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Grade: " + grade;
    }

}




