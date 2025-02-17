Anser to the question no 1



import java.util.Arrays;

public class ReverseArray {
    public static void reverse(float[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            // Swap elements
            float temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // Move pointers
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        float[] arr = {5.8f, 2.6f, 9.0f, 3.4f, 7.1f};

        System.out.println("Original Array: " + Arrays.toString(arr));
        
        reverse(arr); // Call the function to reverse the array

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}

// Answer to the Question no 3
import java.util.*;

class Student {
    String studentID;
    int numCourses;
    List<Course> courses = new ArrayList<>();
    
    public Student(String studentID, int numCourses) {
        this.studentID = studentID;
        this.numCourses = numCourses;
    }
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    public void calculateCGPA() {
        double totalGradePoints = 0;
        int totalCredits = 0;
        
        for (Course course : courses) {
            double totalScore = course.CT + course.AT + course.FE;
            double gradePoint = getGradePoint(totalScore);
            totalGradePoints += gradePoint * course.credit;
            totalCredits += course.credit;
        }
        
        double cgpa = totalGradePoints / totalCredits;
        System.out.println("Student ID: " + studentID);
        System.out.println("Credit Taken: " + totalCredits);
        System.out.println("Credit Earned: " + totalCredits);
        System.out.println("CGPA: " + String.format("%.2f", cgpa));
        System.out.println("Grade: " + getGradeLetter(cgpa));
    }
    
    private double getGradePoint(double score) {
        if (score >= 90) return 4.0;
        if (score >= 85) return 3.7;
        if (score >= 80) return 3.5;
        if (score >= 75) return 3.0;
        if (score >= 70) return 2.7;
        if (score >= 65) return 2.5;
        if (score >= 60) return 2.0;
        if (score >= 50) return 1.5;
        return 0.0;
    }
    
    private String getGradeLetter(double cgpa) {
        if (cgpa >= 3.7) return "A";
        if (cgpa >= 3.5) return "A-";
        if (cgpa >= 3.0) return "B+";
        if (cgpa >= 2.7) return "B";
        if (cgpa >= 2.5) return "B-";
        if (cgpa >= 2.0) return "C";
        if (cgpa >= 1.5) return "D";
        return "F";
    }
}

class Course {
    int credit;
    double CT, AT, FE;
    
    public Course(int credit, double CT, double AT, double FE) {
        this.credit = credit;
        this.CT = CT;
        this.AT = AT;
        this.FE = FE;
    }
}

public class StudentCGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();
        
        System.out.print("Enter number of courses: ");
        int numCourses = scanner.nextInt();
        
        Student student = new Student(studentID, numCourses);
        
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Enter details for Course " + (i + 1) + ":");
            System.out.print("Credit: ");
            int credit = scanner.nextInt();
            System.out.print("CT (Max 30): ");
            double CT = scanner.nextDouble();
            System.out.print("AT (Max 10): ");
            double AT = scanner.nextDouble();
            System.out.print("FE (Max 60): ");
            double FE = scanner.nextDouble();
            
            Course course = new Course(credit, CT, AT, FE);
            student.addCourse(course);
        }
        
        student.calculateCGPA();
        scanner.close();
    }
}


