public class Teacher {

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    private String firstName; //First name of teacher
    private String lastName; //Last name of teacher
    private String subject; //Subject they teach


    //Constructs teacher object with given parameters
    Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    //Sets print statement for Teacher objects to following format
    public String toString(){
        return "Name: " + firstName + " " + lastName + " Subject: " + subject;
    }
}
