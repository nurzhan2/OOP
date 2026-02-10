package gradebook;

import java.util.Scanner;
import students.Student;

public class GradeBookTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // создаём курс
        Course course = new Course(
                "CS101",
                3,
                "Object-Oriented Programming"
        );

        // создаём журнал
        GradeBook book = new GradeBook(course);

        // приветствие
        book.displayMessage();

        System.out.print("How many students? ");
        int n = sc.nextInt();

        // ввод студентов
        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent #" + (i + 1));

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Grade: ");
            int grade = sc.nextInt();

            Student s = new Student(name, grade);

            book.addStudent(s);
        }

        System.out.println("\n===== REPORT =====");
        book.displayGradeReport();

        sc.close();
    }
}
