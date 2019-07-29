import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentReportCard {
    public static void main(String[] args) {
        int numberOfStudents = 1;
        HashMap<String, Object> studentInfo = new HashMap<String, Object>();

        StudentReportCard studentReportCard = new StudentReportCard();

        for (int i = 0; i < numberOfStudents; i++) {

            Scanner scanner = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter student name");
            studentInfo.put("name", scanner.nextLine());

            System.out.println("Marks in English ?");
            studentInfo.put("marksInEnglish", scanner.nextInt());
            System.out.println("Marks in Hindi ?");
            studentInfo.put("marksInHindi", scanner.nextInt());
            System.out.println("Marks in maths ?");
            studentInfo.put("marksInMaths", scanner.nextInt());


        }
        for (int counter = 0; counter < numberOfStudents; counter++) {

            int total = Integer.parseInt(studentInfo.get("marksInEnglish").toString()) + Integer.parseInt(studentInfo.get("marksInHindi").toString()) + Integer.parseInt(studentInfo.get("marksInMaths").toString());
            int percentage = (total * 100) / 300;
            System.out.println(studentInfo.get("name"));
            System.out.println("Subject    Marks   Grades");
            System.out.println("English    " + studentInfo.get("marksInEnglish") + "      " + studentReportCard.getGrade(Integer.parseInt(studentInfo.get("marksInEnglish").toString())));
            System.out.println("Hindi      " + studentInfo.get("marksInHindi") + "      " + studentReportCard.getGrade(Integer.parseInt(studentInfo.get("marksInHindi").toString())));
            System.out.println("Maths      " + studentInfo.get("marksInMaths") + "      " + studentReportCard.getGrade(Integer.parseInt(studentInfo.get("marksInMaths").toString())));
            System.out.println("Total      " + total + "      " + studentReportCard.getGrade(percentage));


            if (Integer.parseInt(studentInfo.get("marksInEnglish").toString()) < 40) {
                System.out.println("Fail");
            } else if (Integer.parseInt(studentInfo.get("marksInHindi").toString()) < 40) {
                System.out.println("Fail");
            } else if (Integer.parseInt(studentInfo.get("marksInMaths").toString()) < 40) {
                System.out.println("Fail");
            } else {
                System.out.println("Pass");
            }
        }
    }

    private String getGrade(int marks) {
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