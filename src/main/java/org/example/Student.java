public class Student {
    public String id;
    public String firstName;
    public String lastName;
    public String gender;
    public String gradeLevel;
    public int mathGrade;
    public int scienceGrade;
    public int englishGrade;
    public int attendancePercentage;

    public Student(String id, String firstName, String lastName, String gender, String gradeLevel,
                   int mathGrade, int scienceGrade, int englishGrade, int attendancePercentage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.gradeLevel = gradeLevel;
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;
        this.englishGrade = englishGrade;
        this.attendancePercentage = attendancePercentage;
    }

    public void show() {
        System.out.println(id + " | " + firstName + " " + lastName + " | " + gender +
                " | " + gradeLevel + " | Math: " + mathGrade + " | Science: " + scienceGrade +
                " | English: " + englishGrade + " | Attendance: " + attendancePercentage + "%");
    }

    public String toCSV() {
        return id + "," + firstName + "," + lastName + "," + gender + "," + gradeLevel + "," +
                mathGrade + "," + scienceGrade + "," + englishGrade + "," + attendancePercentage;
    }

    public static Student fromCSV(String line) {
        String[] p = line.split(",");
        return new Student(p[0], p[1], p[2], p[3], p[4],
                Integer.parseInt(p[5]), Integer.parseInt(p[6]), Integer.parseInt(p[7]), Integer.parseInt(p[8]));
    }
}

