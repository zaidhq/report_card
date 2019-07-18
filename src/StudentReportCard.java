import java.util.Scanner;

public class StudentReportCard {
    public static void main(String[] args) {
        int numberOfStudents = 5;
        String[] student = new String[numberOfStudents];
        int[] marksInEnglish = new int[numberOfStudents];
        int[] marksInHindi = new int[numberOfStudents];
        int[] marksInMaths = new int[numberOfStudents];
        StudentReportCard studentReportCard = new StudentReportCard();

        for (int i = 0; i < numberOfStudents; i++) {
            Scanner scanner = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter student name");
            student[i] = scanner.nextLine();  // Read user input  //nextLine vs next


            System.out.println("Marks in English ?");
            marksInEnglish[i] = scanner.nextInt();
            System.out.println("Marks in Hindi ?");
            marksInHindi[i] = scanner.nextInt();
            System.out.println("Marks in maths ?");
            marksInMaths[i] = scanner.nextInt();


        }
        for (int counter = 0; counter < numberOfStudents; counter++) {

            int total = marksInEnglish[counter] + marksInHindi[counter] + marksInMaths[counter];
            int percentage = (total * 100) / 300;
            System.out.println(student[counter]);
            System.out.println("Subject    Marks   Grades");
            System.out.println("English    " + marksInEnglish[counter] + "      " + studentReportCard.getGrade(marksInEnglish[counter]));
            System.out.println("Hindi      " + marksInHindi[counter] + "      " + studentReportCard.getGrade(marksInEnglish[counter]));
            System.out.println("Maths      " + marksInMaths[counter] + "      " + studentReportCard.getGrade(marksInMaths[counter]));
            System.out.println("Total      " + total + "      " + studentReportCard.getGrade(percentage));


            if (marksInEnglish[counter] < 40) {
                System.out.println("Fail");
            } else if (marksInHindi[counter] < 40) {
                System.out.println("Fail");
            } else if (marksInMaths[counter] < 40) {
                System.out.println("Fail");
            } else {
                System.out.println("Pass");
            }
        }
    }

    public String getGrade(int marks) {
        if (marks >= 90 && marks <= 100)
            return "A+";
        else if (marks >= 80 && marks < 90)
            return "A";
        else if (marks >= 70 && marks < 80)
            return "B+";
        else if (marks >= 60 && marks < 70)
            return "B";
        else if (marks >= 50 && marks < 60)
            return "C+";
        else if (marks >= 40 && marks < 50)
            return "C";
        else if (marks >= 0 && marks < 40)
            return "F";
        else
            return "Invalid marks";

    }
}