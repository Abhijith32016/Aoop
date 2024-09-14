package task6f;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentGradebook {
    private List<Student> students;
    private Scanner scanner;
    private static class Student {
        String name;
        double grade;

        Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return name + ": " + grade;
        }
    }

    public StudentGradebook() {
        students = new LinkedList<>();
        scanner = new Scanner(System.in);
    }
    public void addStudent() {
        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the student's grade: ");
        double grade = scanner.nextDouble();
        scanner.nextLine(); 

        students.add(new Student(name, grade));
        System.out.println("Student added.");
    }
    public void insertStudent() {
        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the student's grade: ");
        double grade = scanner.nextDouble();
        System.out.print("Enter the position to insert (1-based index): ");
        int position = scanner.nextInt();
        scanner.nextLine();

        if (position < 1 || position > students.size() + 1) {
            System.out.println("Invalid position.");
            return;
        }

        students.add(position - 1, new Student(name, grade));
        System.out.println("Student inserted.");
    }
    public void removeStudent() {
        System.out.print("Enter the student's name to remove: ");
        String name = scanner.nextLine();

        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().name.equals(name)) {
                iterator.remove();
                System.out.println("Student removed.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }

        System.out.println("Student Gradebook:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }
    public void run() {
        while (true) {
            System.out.println("\nStudent Gradebook Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Insert Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    insertStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    public static void main(String[] args) {
        StudentGradebook gradebook = new StudentGradebook();
        gradebook.run();
    }
}
