package quizapp;

public class Result implements IResult
{
    private int totalQuestions;

    private int correctAnswers;

    private int wrongAnswers;

    public Result(int totalQuestions, int correctAnswers)
    {
        this.totalQuestions = totalQuestions;
        this.correctAnswers = correctAnswers;
        this.wrongAnswers = totalQuestions - correctAnswers;
    }

    @Override
    public void showResult()
    {

        System.out.println("Your result:");
        System.out.println("Total questions: " + totalQuestions);
        System.out.println("Correct answers: " + correctAnswers);
        System.out.println("Wrong answers: " + wrongAnswers);

        double percentage = showPercentage(correctAnswers, totalQuestions);

        System.out.println("Percentage: " + percentage + "%");

        String performance = showPerformance(percentage);

        System.out.println("Performance: " + performance);
    }

    @Override
    public double showPercentage(int correctAnswers, int totalQuestions)
    {
        return (double) correctAnswers / totalQuestions * 100;
    }
    @Override
    public String showPerformance(double percentage)
    {
        if (percentage == 100)
        {
            return "Excellent!";
        } else if (percentage >= 80)
        {
            return "Very good!";
        } else if (percentage >= 60)
        {
            return "Good!";
        } else if (percentage >= 40)
        {
            return "Fair!";
        } else if (percentage >= 20)
        {
            return "Poor!";
        } else {
            return "Very poor!";
        }
    }
}
