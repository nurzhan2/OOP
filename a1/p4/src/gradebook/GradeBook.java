package gradebook;

import java.util.ArrayList;
import students.Student;

public class GradeBook {

    private Course course;
    private ArrayList<Student> students;

    // конструктор
    public GradeBook(Course course) {
        this.course = course;
        students = new ArrayList<>();
    }

    // добавить студента
    public void addStudent(Student s) {
        students.add(s);
    }

    // приветствие
    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course);
    }

    // среднее
    public double determineClassAverage() {
        int sum = 0;

        for (Student s : students)
            sum += s.getGrade();

        return (double) sum / students.size();
    }

    // отчёт
    public void displayGradeReport() {

        int[] freq = new int[11];

        Student best = null;
        Student worst = null;

        int max = -1;
        int min = 101;

        for (Student s : students) {

            int g = s.getGrade();

            if (g > max) {
                max = g;
                best = s;
            }

            if (g < min) {
                min = g;
                worst = s;
            }

            freq[g / 10]++;
        }

        System.out.println("Average: " + determineClassAverage());
        System.out.println("Highest: " + best);
        System.out.println("Lowest: " + worst);

        outputBarChart(freq);
    }

    // гистограмма
    private void outputBarChart(int[] freq) {

        System.out.println("\nGrade distribution:");

        for (int i = 0; i < freq.length; i++) {

            int low = i * 10;
            int high = (i == 10) ? 100 : low + 9;

            System.out.printf("%02d-%02d: ", low, high);

            for (int j = 0; j < freq[i]; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
