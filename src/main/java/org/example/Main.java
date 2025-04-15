import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StudentService service = new StudentService();

        boolean running = true;

        while (running) {
            System.out.println("\n1 - Добавить студента");
            System.out.println("2 - Показать всех");
            System.out.println("3 - Удалить по ID");
            System.out.println("4. Отчёт");
            System.out.println("0 - Выход");
            System.out.print("Выбор: ");
            String input = in.nextLine();

            if (input.equals("1")) {
                System.out.print("ID: ");
                String id = in.nextLine();
                System.out.print("Имя: ");
                String fn = in.nextLine();
                System.out.print("Фамилия: ");
                String ln = in.nextLine();
                System.out.print("Пол: ");
                String gender = in.nextLine();
                System.out.print("Класс: ");
                String gradeLevel = in.nextLine();
                System.out.print("Математика: ");
                int math = getIntInput(in, "Оценка по математике: ");
                System.out.print("Наука: ");
                int science = getIntInput(in, "Оценка по науке: ");
                System.out.print("Английский: ");
                int english = getIntInput(in, "Оценка по английскому: ");
                System.out.print("Посещаемость: ");
                int attendance = getIntInput(in, "Посещаемость (%): ");

                Student s = new Student(id, fn, ln, gender, gradeLevel, math, science, english, attendance);
                service.add(s);

            } else if (input.equals("2")) {
                List<Student> list = service.getAll();
                for (Student s : list) {
                    s.show();
                }

            } else if (input.equals("3")) {
                System.out.print("ID студента: ");
                String id = in.nextLine();
                service.delete(id);

            } else if (input.equals("4")) {
                service.generateReport();
            }
            else if (input.equals("0")) {
                running = false;

            } else {
                System.out.println("Неверный ввод.");
            }
        }
    }

    public static int getIntInput(Scanner in, String prompt) {
        System.out.print(prompt);
        String input = in.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("❌ Неверный ввод. Введите целое число.");
            return getIntInput(in, prompt);
        }
    }
}
