package quizapp;

public class Question
{
    private String question;

    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;

    private Answer answer;

    private String userAnswer;

    public Question(String question, String optionA, String optionB,
                    String optionC, String optionD, Answer answer )
    {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.answer = answer;
    }
    public String getQuestion()
    {
        return question;
    }

    public String getOptionA()
    {
        return optionA;
    }

    public String getOptionB()
    {
        return optionB;
    }

    public String getOptionC()
    {
        return optionC;
    }

    public String getOptionD()
    {
        return optionD;
    }

    public Answer getAnswer()
    {
        return answer;
    }

    public String getUserAnswer()
    {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer)
    {
        this.userAnswer = userAnswer;
    }
}