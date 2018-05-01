package edu.illinois.cs.cs125.cs125mp7;

public class ComputerQuestionLibrary {
    private String Questions[] = {

            "Nvidia's headquarters are based in which Silicon Valley city?",

            "What is the most preferred image format used for logos in the Wikimedia database?",

            "Which coding language was the #1 programming language in terms of usage on GitHub in 2015?",

            "In Hexadecimal, what color would be displayed from the color code?",

            "Which computer language would you associate Django framework with?",

            "What does LCD stand for?",

            "Which operating system was released first?",

            "Which of the following is a personal computer made by the Japanese company Fujitsu?",

            "What vulnerability ranked #1 on the OWASP Top 10 in 2013?",

            "Who is considered the real OG of CS?"


    };

    private String Choices[][] = {

            {"Santa Clara", "Palo Alto","Cupertino","Mountain View"},

            {".gif", ".jpeg", ".svg", ".png"},

            {"C#","Python","PHP", "JavaScript"},

            {"Green", "Red","Blue","Yellow"},

            {"C#", "C++", "Python", "Java"},

            {"Liquid Crystal Display", "Language Control Design","Last Common Difference","Long Continuous Design"},

            {"Windows","Linux","OS2", "Mac OS"},

            {"MSX", "FM-7", "PC-9801","Xmillennium "},

            {"Broken Authentication","Injection", "Cross-Site Scripting","Insecure Direct Object References"},

            {"Alan Turing", "Mark Zuckerburg", "Geoff Challen", "Steve Jobs"}

    };

    private String CorrectAnswers[] = {"Santa Clara", ".svg", "JavaScript", "Green",
            "Python", "Liquid Crystal Display", "Mac OS","FM-7","Injection","Geoff Challen"};
    public int numQ() {return Questions.length;};


    public String getCorrectAnswer(int a) {
        return CorrectAnswers[a];
    }
    public String getQuestion(int a) {
        return Questions[0];
    }
    public String getChoice1(int a) {
        return Choices[a][0];
    }
    public String getChoice2(int a) {
        return Choices[a][1];
    }
    public String getChoice3(int a) {
        return Choices[a][2];
    }
    public String getChoice4(int a) {
        return Choices[a][3];
    }
}
