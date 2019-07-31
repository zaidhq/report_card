import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentReportCard {
    public static void main(String[] args) {

        ArrayList<StudentInfo> allStudentInfo = new ArrayList<StudentInfo>();
        StudentReportCard studentReportCard = new StudentReportCard();

        while (true) {
            StudentInfo studentInfo= new StudentInfo();
            Scanner scanner = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter student name");
            studentInfo.setName(scanner.nextLine());

            System.out.println("Marks in English ?");
            studentInfo.setMarksInEnglish(scanner.nextInt());
            System.out.println("Marks in Hindi ?");
            studentInfo.setMarksInHindi(scanner.nextInt());
            System.out.println("Marks in maths ?");
            studentInfo.setMarksInMaths(scanner.nextInt());
            allStudentInfo.add(studentInfo);
            System.out.println("type \"yes\" to continue");
            String isContinue = scanner.next();
            if (!isContinue.equals("yes"))
                break;

        }
        for (StudentInfo singleStudentInfo : allStudentInfo) {
            int total = singleStudentInfo.getMarksInEnglish() + singleStudentInfo.getMarksInHindi() + singleStudentInfo.getMarksInMaths();
            int percentage = (total * 100) / 300;
            System.out.println(singleStudentInfo.getName());
            System.out.println("Subject    Marks   Grades");
            System.out.println("English    " + singleStudentInfo.getMarksInEnglish() + "      " + studentReportCard.getGrade((singleStudentInfo.getMarksInEnglish())));
            System.out.println("Hindi      " + singleStudentInfo.getMarksInHindi() + "      " + studentReportCard.getGrade((singleStudentInfo.getMarksInHindi())));
            System.out.println("Maths      " + singleStudentInfo.getMarksInMaths() + "      " + studentReportCard.getGrade(singleStudentInfo.getMarksInMaths()));
            System.out.println("Total      " + total + "      " + studentReportCard.getGrade(percentage));


            if (singleStudentInfo.getMarksInEnglish() < 40) {
                System.out.println("Fail");
            } else if (singleStudentInfo.getMarksInHindi() < 40) {
                System.out.println("Fail");
            } else if (singleStudentInfo.getMarksInMaths() < 40) {
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