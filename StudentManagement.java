package j20_Collection;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
	private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Year of Passing: ");
        int yop = scanner.nextInt();

        Student student = new Student(id, name, department, yop);
        studentList.add(student);
        System.out.println("Student added successfully!");
    }

    private static void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        for (Student student : studentList) {
            if (student.getId() == id) {
                System.out.print("Enter new name (or press Enter to skip): ");
                String newName = scanner.nextLine();
                if (!newName.isEmpty()) {
                    student.setName(newName);
                }

                System.out.print("Enter new department (or press Enter to skip): ");
                String newDept = scanner.nextLine();
                if (!newDept.isEmpty()) {
                    student.setDepartment(newDept);
                }

                System.out.print("Enter new Year of Passing (or press Enter to skip): ");
                String newYopStr = scanner.nextLine();
                if (!newYopStr.isEmpty()) {
                    int newYop = Integer.parseInt(newYopStr);
                    student.setYearOfPassing(newYop);
                }

                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
}

