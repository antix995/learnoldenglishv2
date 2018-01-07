package com.antixuni.learnoldenglishv2;

public class QuestionLibrary {

    private String mQuestions [] = {
            "What does 'ēala!' mean?",
            "How do you say 'I am' in old English?",
            "'hwā is ðis?' means..?",
            "'mōdor' is a...?",

    };

    private String mChoices [][] = {
            {"Hello!", "I am!", "My name is!"},
            {"ic hāte", "ic eom", "hwā is ðis"},
            {"What is this?", "Who is this?", "What are you called?"},
            {"Father", "Brother", "Mother"}
    };

    private String mCorrectAnswers[] = {"Hello!", "ic eom", "Who is this?", "Mother"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

    public int getLength() {
        return mQuestions.length;
    }
}
