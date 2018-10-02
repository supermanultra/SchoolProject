public class Main {
    public static void main(String[] args) {

        School WVSS = new School("WVSS", "Drew Barrymore", 1248);

        Teacher barry = new Teacher("Barry", "Henderson", "Socials");
        Teacher larry = new Teacher("Larry","Jordan", "Math");
        Teacher brian = new Teacher("Brian", "Wilcox", "Science");

        WVSS.addTeacher(barry);
        WVSS.addTeacher(larry);
        WVSS.addTeacher(brian);


        Student harry = new Student("Harry", "Nichols", 12);
        Student tom = new Student("Tom", "Halifax", 11);
        Student ben = new Student("Ben", "Sheffield", 7);
        Student eeyore = new Student("Eeyore", "Donkey", 3);
        Student jim = new Student("Jim", "Halpert", 9);
        Student jordy = new Student("Jordy", "Michaels", 8);
        Student michael = new Student("Michael", "Scott", 1);
        Student thomas = new Student("Thomas", "Brady", 6);
        Student edward = new Student("Edward", "Patrick", 5);
        Student donny = new Student("Donny", "Nelson", 4);

        WVSS.addStudent(harry);
        WVSS.addStudent(tom);
        WVSS.addStudent(ben);
        WVSS.addStudent(eeyore);
        WVSS.addStudent(jim);
        WVSS.addStudent(jordy);
        WVSS.addStudent(michael);
        WVSS.addStudent(thomas);
        WVSS.addStudent(edward);
        WVSS.addStudent(donny);


        System.out.println(WVSS); // .showTeachers() and .showStudents() work too

        WVSS.deleteTeacher(barry);

        WVSS.deleteStudent(thomas);
        WVSS.deleteStudent(jim);

        System.out.println(WVSS);









    }
}
