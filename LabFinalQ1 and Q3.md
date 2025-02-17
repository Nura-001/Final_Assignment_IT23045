Anser to the question no 1



       import java.util.Arrays;

public class ReverseArray {
    public static void reverse(float[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            float temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        float[] arr = {5.8f, 2.6f, 9.0f, 3.4f, 7.1f};

        System.out.println("Original Array: " + Arrays.toString(arr));
        
        reverse(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}

/*
Output:
Original Array: [5.8, 2.6, 9.0, 3.4, 7.1]
Reversed Array: [7.1, 3.4, 9.0, 2.6, 5.8]
*/

   import java.util.Scanner;

public class StudentCGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking student ID input
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

        // Taking number of courses input
        System.out.print("Enter No. of Courses: ");
        int numCourses = scanner.nextInt();

        int totalCredits = 0;
        int totalCreditsEarned = 0;
        double weightedScore = 0;

        // Loop through each course to collect course details
        for (int i = 1; i <= numCourses; i++) {
            System.out.println("Enter details for C" + i + ":");

            // Taking course credit input
            System.out.print("  Credit (Max 3): ");
            int credit = scanner.nextInt();
            totalCredits += credit;

            // Taking CT, AT, FE marks input
            System.out.print("  CT (Max 30): ");
            int ct = scanner.nextInt();
            System.out.print("  AT (Max 10): ");
            int at = scanner.nextInt();
            System.out.print("  FE (Max 60): ");
            int fe = scanner.nextInt();

            // Calculating total marks
            int totalMarks = ct + at + fe;

            // Determine grade point based on total marks
            double gradePoint;
            if (totalMarks >= 80) {
                gradePoint = 4.0;  // A+
            } else if (totalMarks >= 75) {
                gradePoint = 3.7;  // A
            } else if (totalMarks >= 70) {
                gradePoint = 3.5;  // A-
            } else if (totalMarks >= 60) {
                gradePoint = 3.0;  // B+
            } else if (totalMarks >= 50) {
                gradePoint = 2.5;  // B
            } else {
                gradePoint = 0.0;  // F (fail)
            }

            // Add credits earned based on grade point
            if (gradePoint > 0) {
                totalCreditsEarned += credit;
            }

            // Calculate weighted score
            weightedScore += gradePoint * credit;
        }

        // Calculate CGPA
        double cgpa = weightedScore / totalCredits;

        // Determine grade based on CGPA
        String grade;
        if (cgpa == 4) {
            grade = "A+";  // Grade A+
        } else if (cgpa >= 3.7) {
            grade = "A";   // Grade A
        } else if (cgpa >= 3.5) {
            grade = "A-";  // Grade A-
        } else if (cgpa >= 3.0) {
            grade = "B+";  // Grade B+
        } else if (cgpa >= 2.5) {
            grade = "B";   // Grade B
        } else {
            grade = "F";   // Grade F (fail)
        }

        // Output the student details
        System.out.println("\nStudent ID: " + studentID);
        System.out.println("Credit Taken: " + totalCredits);
        System.out.println("Credit Earned: " + totalCreditsEarned);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

/*
Sample Output:

Enter Student ID: S12345
Enter No. of Courses: 3
Enter details for C1:
  Credit (Max 3): 3
  CT (Max 30): 28
  AT (Max 10): 8
  FE (Max 60): 55
Enter details for C2:
  Credit (Max 3): 3
  CT (Max 30): 25
  AT (Max 10): 7
  FE (Max 60): 45
Enter details for C3:
  Credit (Max 3): 3
  CT (Max 30): 30
  AT (Max 10): 9
  FE (Max 60): 58

Student ID: S12345
Credit Taken: 9
Credit Earned: 9
CGPA: 3.75
Grade: A
*/
