import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {

        System.out.println("\n✨ Welcome, scholar wrangler extraordinaire! ✨" +
                "\n\uD83C\uDF89 You've just activated the Student Grades Management System" +
                "—your trusty sidekick for managing grades with flair and precision! \uD83C\uDF89\n" +
                "\n\t \uD83D\uDCDA Here's what I can do for you:\n\n" +
                "\t\t \uD83D\uDCDD Input and store grades for your brilliant students.\n" +
                "\t\t \uD83D\uDCCA Calculate dazzling averages that'll make math proud.\n" +
                "\t\t \uD83E\uDD47 Reveal the star achievers with the highest grades.\n" +
                "\t\t \uD83D\uDEE0\uFE0F Spot areas for improvement with the lowest grades.\n" +
                "\t\t \uD83D\uDC40 Display all grades in a way that's clear and easy to understand!\n" +
                "\n\uD83D\uDD27 Let the grade magic begin! Ready to dive into the world of data excellence? \uD83D\uDE80"+
                "\n______________________________________________________________________________________\n\n"
        );

        // Declare and Initialize Arrays
        double[] grades = new double[10];
        Scanner sc = new Scanner(System.in);

        // Implement Array Operations
        double sum = 0;
        double avg = 0;
        double minGrade = 0;
        double maxGrade = 0;
        for (int i = 0; i < grades.length; i++) {

            // User Input and Storage
            System.out.print("✨ Please enter Grade #" + (i + 1) + ": ");
            grades[i] = sc.nextDouble();

            // Find Min and Max grades
            if (i == 0) {
                minGrade = grades[0];
                maxGrade = grades[0];
            }

            if (grades[i] < minGrade) {
                minGrade = grades[i];
            } else if (grades[i] > maxGrade) {
                maxGrade = grades[i];
            }

            // Calculate Average Grade
            sum += grades[i];
            avg = sum / (i + 1);
        }

        System.out.println(
                "\n\n_________________________________________________________________\n"+
                "\n\uD83C\uDF89 Grade Report Incoming! \uD83C\uDF89\n" +
                "\n\uD83C\uDF1F Your average grade: " + avg + "\n" +
                "\uD83D\uDCC9 Lowest grade: " + minGrade + "\n" +
                "\uD83D\uDCC8 Highest grade: " + maxGrade + "\n" +
                "\nKeep up the fantastic work—you're on the path to greatness! \uD83D\uDE80✨" +
                "\n_________________________________________________________________\n"
        );

        // Display all grades
        System.out.println(
                "\n\uD83D\uDCCB Here’s your full grade summary: (drumroll, please!) \uD83E\uDD41\n" +
                "Go ahead and take a look at the magic numbers! \uD83D\uDE80\n"
        );

        for (int i = 0; i < grades.length; i++) {
            System.out.println("\t\uD83C\uDF1F You've entered Grade #" + (i + 1) + ": " + grades[i]);
        }

        System.out.println(
                "\n\n✨ Farewell, Grade Guru! ✨ \n" +
                "You've reached the end of your journey with the Student Grades Management System\n" +
                "—Until next time, stay brilliant and keep shining! \uD83C\uDF08✨"
        );
    }
}