package j20_Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Student_grades_in_TreeMap {
	 public static void main(String[] args) {
	        
	        TreeMap<String, Integer> studentGrades = new TreeMap<>();
	        Scanner scanner = new Scanner(System.in);
	       
	        System.out.print("Enter the number of students: ");
	        int n = scanner.nextInt();
	        scanner.nextLine();  
	        System.out.println();
	       
	        System.out.println("Enter " + n + " student names and their grades:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter name of student " + (i + 1) + ": ");
	            String name = scanner.nextLine();
	            System.out.print("Enter grade for " + name + ": ");
	            int grade = scanner.nextInt();
	            scanner.nextLine();  
	            System.out.println();

	            studentGrades.put(name, grade);
	        }

	        System.out.println("\nStudent Grades:");
	        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        if (!studentGrades.isEmpty()) {
	            int totalGrades = 0;
	            for (int grade : studentGrades.values()) {
	                totalGrades += grade;
	            }
	            double average = totalGrades / (double) studentGrades.size();
	            System.out.printf("\nAverage Grade: %.2f\n", average);
	        } else {
	            System.out.println("No grades entered.");
	        }

	        scanner.close();
	    }
}


