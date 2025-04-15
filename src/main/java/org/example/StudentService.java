import java.io.*;
import java.util.*;

public class StudentService {
    String file = "src/Student.csv";

    public void add(Student s) {
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write(s.toCSV() + "\n");
            fw.close();
        } catch (IOException e) {}
    }

    public List<Student> getAll() {
        List<Student> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                list.add(Student.fromCSV(line));

                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {}
        return list;
    }

    public void delete(String id) {
        List<Student> list = getAll();
        try {
            FileWriter fw = new FileWriter(file);
            for (Student s : list) {
                if (!s.id.equals(id)) {
                    fw.write(s.toCSV() + "\n");
                }
            }
            fw.close();
        } catch (IOException e) {}
    }
    public void generateReport() {
        List<Student> students = getAll();

        if (students.size() == 0) {
            System.out.println("⚠️ Нет данных для отчёта.");
            return;
        }

        int total = students.size();
        int totalMath = 0;
        int totalScience = 0;
        int totalEnglish = 0;
        int totalAttendance = 0;

        for (Student s : students) {
            totalMath += s.mathGrade;
            totalScience += s.scienceGrade;
            totalEnglish += s.englishGrade;
            totalAttendance += s.attendancePercentage;
        }

        System.out.println("\n=== 📋 Отчёт по студентам ===");
        System.out.println("Всего студентов: " + total);
        System.out.println("Средняя оценка по математике: " + (totalMath / total));
        System.out.println("Средняя оценка по науке: " + (totalScience / total));
        System.out.println("Средняя оценка по английскому: " + (totalEnglish / total));
        System.out.println("Средняя посещаемость: " + (totalAttendance / total) + "%");
    }

}

