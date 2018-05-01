package edu.illinois.cs.cs125.cs125mp7;

public class MathQuestionLibrary {
    private String Questions[] = {

                "In Roman Numerals, what does XL equate to?",

                "The metric prefix 'atto-' makes a measurement how much smaller than the base unit?",

                "How many sides does a heptagon have?",

                "What is the correct order of operations for solving equations?",

                "In the hexadecimal system, what comes after 9?",

                "How many zeros are there in a googol?",

                "What are the first 6 digits of the number pi?",

                "What is the Roman numeral for 500?",

                "What Greek letter is used to signify summation?",

                "What is the Derivative of 32x?"

    };

    private String Choices[][] = {

            {"15", "50", "60", "40"},

            {"One Billionth", "One Quadrillionth", "One Quintillionth", "One Hundreth"},

            {"7", "6", "13", "12"},

            {"Addition, Multiplication, Division, Subtraction, Addition, Parentheses","Parentheses, Exponents, Addition, Substraction, Multiplication, Division","Parentheses, Exponents, Multiplication, Division, Addition, Subtraction","The order in which the operations are written."},

            {"10", "0", "16", "A"},

            {"10", "1,000", "100", "1,000,000"},

            {"3.14169", "3.14159", "3.12423", "3.25812"},

            {"L", "C", "X", "D"},

            {"Delta", "Sigma", "Alpha", "Omega"},

            {"32", "32x", "4 and 8", "3 and 2"}
    };

    private String CorrectAnswers[] = {"40", "One Quintillionth", "7", "Parentheses, Exponents, Multiplication, Division, Addition, Subtraction",
            "A", "100", "3.14159","D","Sigma","32"};
    public int numQ() {return Questions.length;}

    public String getCorrectAnswer(int a) {
        return CorrectAnswers[a];
    }
    public String getQuestion(int a) {
        return Questions[a];
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
    public String getChoice4(int a) { return Choices[a][3]; }

}
