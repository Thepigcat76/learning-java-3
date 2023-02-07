package practice_projects.exercise_project;

import java.util.Scanner;

public class exercise_project {
    public static void main(String[] args) {

        int score = 0;

        int q1;
        String q2;
        String q3;

        String a1;
        String a2;
        String a3;

        System.out.println("Quiz:");
        System.out.println("Question 1: How many cats do I own?");

        Scanner scanner = new Scanner(System.in);
        q1 = scanner.nextInt();

        if(q1==0) {
            System.out.println("True!");
            score++;
        } else {
         System.out.println("Wrong!");
        }

        System.out.println("Next Question:");
        System.out.println("Question 2: Is the earth flat?");

        Scanner scanner1 = new Scanner(System.in);
        q2 = scanner1.next();

        if(q2.equals("no")||q2.equals("No")) {
            System.out.println("True!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is: no");
        }

        System.out.println("Last Question:");
        System.out.println("Question 3: Am I cool?");

        Scanner scanner2 = new Scanner(System.in);
        q3 = scanner2.next();

        if(q3.equals("yes")||q3.equals("Yes")) {
            System.out.println("True!");
            System.out.println("");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is: no");
        }
        System.out.println("Thats it! You have scored: " + score);
    }
}
