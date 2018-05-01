package edu.illinois.cs.cs125.cs125mp7;

public class NaturalQuestionLibrary {
    private String Questions[] = {

            "Which part of the body does glaucoma affect?",

            "What do you study if you are studying entomology?",

            "The moons, Miranda, Ariel, Umbriel, Titania and Oberon orbit which planet?",

            "After which Danish city is the 72th element on the periodic table named?",

            "How many officially recognized dwarf planets in the solar system are named after Polynesian deities?",

            "Where is the Gluteus Maximus muscle located?",

            "Which moon is the only satellite in our solar system to possess a dense atmosphere?",

            "The humerus, paired radius, and ulna come together to form what joint?",

            "Two protons collide. What is the result?",

            "Which one of these scientists conducted the Gold Foil Experiment which concluded that atoms are mostly made of empty space?"};




    private String Choices[][] = {

            {"Throat","Stomach","Liver", "Eyes"},

            {"Insects", "Humans", "the Brain", "Fish"},

            {"Jupiter", "Venus", "Uranus", "Neptune"},

            { "Odense", "Herning", "Skagen", "Copenhagen"},

            {"2", "0", "1", "5"},

            {"Arm","Head", "Butt","Torso"},

            {"Europa", "Miranda", "Titan", "Callisto"},

            {"Knee", "Elbow", "Shoulder","Ankle"},

            {"Higgs Boson", "Pion", "Helium", "Fission"},

            {"Niels Henrik David Bohr", "Archimedes", "Ernest Rutherford", "Joseph John Thomson"}
    };


    private String CorrectAnswers[] = {"Eyes", "Insects", "Uranus", "Copenhagen", "2", "Butt", "Titan", "Elbow", "Higgs Boson", "Ernest Rutherford"};

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
