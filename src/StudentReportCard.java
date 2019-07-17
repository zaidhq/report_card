import java.util.Scanner;

public class StudentReportCard {
    public static void main(String[] args) {

        StudentReportCard studentReportCard = new StudentReportCard();

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter student name");
        String student1 = scanner.nextLine();  // Read user input  //nextLine vs next
        System.out.println("student name is: " + student1);

        System.out.println("Marks in English ?");
        int marksInEnglish = scanner.nextInt();
        System.out.println("Marks in Hindi ?");
        int marksInHindi = scanner.nextInt();
        System.out.println("Marks in maths ?");
        int marksInMaths = scanner.nextInt();
        int total = marksInEnglish + marksInHindi + marksInMaths;
        int percentage = ((marksInEnglish + marksInHindi + marksInMaths) * 100) / 300;

        System.out.println(student1);
        System.out.println("Subject    Marks   Grades");
        System.out.println("English    " + marksInEnglish + "      " + studentReportCard.getGrade(marksInEnglish));
        System.out.println("Hindi      " + marksInHindi + "      " + studentReportCard.getGrade(marksInHindi));
        System.out.println("Maths      " + marksInMaths + "      " + studentReportCard.getGrade(marksInMaths));
        System.out.println("Total      " + total + "      " + studentReportCard.getGrade(percentage));
        if (marksInEnglish < 40) {
            System.out.println("Fail");
        } else if (marksInHindi < 40) {
            System.out.println("Fail");
        } else if (marksInMaths < 40) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");


        }
        scanner = new Scanner(System.in);
        System.out.println("Enter student name");
        String student2 = scanner.nextLine();  // Read user input  //nextLine vs next
        System.out.println("student name is: " + student2);

        System.out.println("Marks in English ?");
        int marksInEnglish2 = scanner.nextInt();
        System.out.println("Marks in Hindi ?");
        int marksInHindi2 = scanner.nextInt();
        System.out.println("Marks in maths ?");
        int marksInMaths2 = scanner.nextInt();
        int total2 = marksInEnglish2 + marksInHindi2 + marksInMaths2;
        int percentage2 = ((marksInEnglish2 + marksInHindi2 + marksInMaths2) * 100) / 300;

        System.out.println(student2);
        System.out.println("Subject    Marks   Grades");
        System.out.println("English    " + marksInEnglish2 + "      " + studentReportCard.getGrade(marksInEnglish2));
        System.out.println("Hindi      " + marksInHindi2 + "      " + studentReportCard.getGrade(marksInHindi2));
        System.out.println("Maths      " + marksInMaths2 + "      " + studentReportCard.getGrade(marksInMaths2));
        System.out.println("Total      " + total2 + "      " + studentReportCard.getGrade(percentage2));
        if (marksInEnglish2 < 40) {
            System.out.println("Fail");
        } else if (marksInHindi2 < 40) {
            System.out.println("Fail");
        } else if (marksInMaths2 < 40) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");


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

