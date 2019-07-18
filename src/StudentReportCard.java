import java.util.Scanner;

public class StudentReportCard {
    public static void main(String[] args) {

        StudentReportCard studentReportCard = new StudentReportCard();
        while (true) {
            Scanner scanner = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter student name");
            String student1 = scanner.nextLine();  // Read user input  //nextLine vs next

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
            System.out.println("do you want to continue");//taking user approval to continue
            String isContinue = scanner.next();

            if (isContinue.equals("yes")) {

                scanner = new Scanner(System.in);
                System.out.println("Enter student name");
                student1 = scanner.nextLine();

                System.out.println("Marks in English ?");
                marksInEnglish = scanner.nextInt();
                System.out.println("Marks in Hindi ?");
                marksInHindi = scanner.nextInt();
                System.out.println("Marks in maths ?");
                marksInMaths = scanner.nextInt();
                total = marksInEnglish + marksInHindi + marksInMaths;
                percentage = ((marksInEnglish + marksInHindi + marksInMaths) * 100) / 300;

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
            } else {
                System.out.println("Thank you");
                break;

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