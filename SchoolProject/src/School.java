import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>(); //List of teachers
    ArrayList<Student> students = new ArrayList<>(); //List of students
    ArrayList<String> courses = new ArrayList<>(); //Has no purpose? Nothing in instructions about using this ArrayList

    private String name; //Name of school
    private String founder; //Name of founder of school
    private int streetNum; //Street number of school


    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    //Constructs School object with given parameters
    School(String name,String founder, int streetNum) {
        this.name = name;
        this.founder = founder;
        this.streetNum = streetNum;
    }

    //Adds teachers to list
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    //Deletes teachers from list
    public void deleteTeacher(Teacher teacher){
        teachers.remove(teacher);
    }

    //Adds students to list
    public void addStudent(Student student){
        students.add(student);
    }

    //Deletes students from list
    public void deleteStudent(Student student){
        students.remove(student);
    }
    //Shows list of teachers
    public String showTeachers(){
        return "Teachers: " + teachers;
    }

    //Shows list of students
    public String showStudents(){
        return "Students: " + students;
    }

    //Sets print statement of School objects to output Teachers + Students with readable formatting
    public String toString(){
        return "Teachers: " + teachers + "\nStudents: " + students;
    }
}

