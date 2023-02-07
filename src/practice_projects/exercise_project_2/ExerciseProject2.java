package practice_projects.exercise_project_2;

import java.util.Scanner;

public class ExerciseProject2 {
    public static void main(String[] args) {
        String start;
        String repeat;
        String startConfirm;
        String question1;
        String question2;
        String question3;
        String question4;
        String question5;
        int score = 0;


        start = "Type in ok to start the quiz";

        Scanner scanner = new Scanner(System.in);


        System.out.println(start);

        startConfirm = scanner.next();
        if (startConfirm.equals("ok")) {
            printQuestion(0);
        }

        question1 = scanner.next();
        if (question1.equals("sheep")) {
            printContinue(2);
            printQuestion(1);
            score++;
        } else {
            System.out.println("Bad!");
            printContinueButBad(2);
            printQuestion(1);
        }

        question2 = scanner.next();
        if (question2.equals("8")) {
            printContinue(3);
            printQuestion(2);
            score++;
        } else {
            System.out.println("Bad!");
            printContinueButBad(3);
            printQuestion(2);
        }

        question3 = scanner.next();
        if (question3.equals("365")) {
            printContinue(4);
            printQuestion(3);
            score++;
        } else {
            System.out.println("Bad!");
            printContinueButBad(4);
            printQuestion(3);
        }

        question4 = scanner.next();
        if (question4.equals("Joe")) {
            printContinue(5);
            printQuestion(4);
            score++;
        } else {
            System.out.println("Bad!");
            printContinueButBad(5);
            printQuestion(4);
        }

        question5 = scanner.next();
        if (question5.equals("cat")) {
            score++;
            System.out.println("That's it! You scored: " + score + "/5");

        } else {
            System.out.println("Bad!");
            System.out.println("That's it! You scored: " + score + "/5");

        }
    }

    public static void printQuestion(int array) {
        String[] questions = new String[5];
        questions[0] = "What is the plural of sheep?";
        questions[1] = "How many people are there on earth (in billions) ?";
        questions[2] = "How many days are there in a year?";
        questions[3] = "What is the first name of the US president?";
        questions[4] = "Which animal hunts mice?";
        System.out.println(questions[array]);
    }

    public static void printContinue(int number) {
        System.out.println("Great Job! Time for question " + number);
    }

    public static void printContinueButBad(int number) {
        System.out.println("You so bad! Time for question " + number);
    }
}
