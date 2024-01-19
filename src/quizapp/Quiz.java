package quizapp;

import java.util.Scanner;

public class Quiz
{

    private Question[] questions;


    private Scanner scan;

    public Quiz()
    {
        questions = new Question[5];
        questions[0] = new Question("What is the capital of India?",
                "A. Delhi",
                "B. Mumbai",
                "C. Kolkata",
                "D. Chennai",
                new Answer("A"));
        questions[1] = new Question("Which of these is a valid keyword in Java?",
                "A. interface",
                "B. string",
                "C. Float",
                "D. unsigned",
                new Answer("A"));
        questions[2] = new Question("What is the name of the method that is used to start a thread execution?",
                "A. init()",
                "B. start()",
                "C. run()",
                "D. resume()",
                new Answer("B"));
        questions[3] = new Question("Which of these is a correct way to declare an array in Java?",
                "A. int array[]",
                "B. int[] array",
                "C. array[] int",
                "D. Both A and B",
                new Answer("D"));
        questions[4] = new Question("What is the output of this code?\n" +
                "public class Test {\n" +
                "  public static void main(String[] args) {\n" +
                "    int x = 10;\n" +
                "    int y = x++ + ++x;\n" +
                "    System.out.println(y);\n" +
                "  }\n" +
                "}",
                "A. 20",
                "B. 21",
                "C. 22",
                "D. 23",
                new Answer("C"));
        scan = new Scanner(System.in);
    }

    public void displayQuestions()
    {
        for (int i = 0; i < questions.length; i++)
        {
            System.out.println("Question " + (i + 1) + ":");
            System.out.println(questions[i].getQuestion());

            System.out.println("A. " + questions[i].getOptionA());
            System.out.println("B. " + questions[i].getOptionB());
            System.out.println("C. " + questions[i].getOptionC());
            System.out.println("D. " + questions[i].getOptionD());

            System.out.print("Enter your answer: ");
            String answer = scan.nextLine();


            if (answer.equalsIgnoreCase("A") ||
                    answer.equalsIgnoreCase("B") ||
                    answer.equalsIgnoreCase("C") ||
                    answer.equalsIgnoreCase("D"))
            {

                questions[i].setUserAnswer(answer);
            }
            else
            {
                // Display an error message and repeat the question
                System.out.println("Invalid answer. Please enter A, B, C, or D.");
                i--;
            }
        }
    }


    public void checkAnswers()
    {

        int correct = 0;


        for (Question q : questions)
        {

            String userAnswer = q.getUserAnswer();
            String correctAnswer = q.getAnswer().getAnswer();


            if (userAnswer.equalsIgnoreCase(correctAnswer))
            {
                correct++;
            }
        }


        Result result = new Result(questions.length, correct);

        // Show the result
        result.showResult();
    }
}