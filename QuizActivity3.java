package edu.illinois.cs.cs125.cs125mp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity3 extends AppCompatActivity {
    private NaturalQuestionLibrary library3 = new NaturalQuestionLibrary();
    private TextView scoreView;
    private TextView questionView;
    private Button buttonChoice1;
    private Button buttonChoice2;
    private Button buttonChoice3;
    private Button buttonChoice4;

    private String answer;
    private int score;
    private int questionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        scoreView = findViewById(R.id.score);
        questionView = findViewById(R.id.question3);
        buttonChoice1 = findViewById(R.id.choice9);
        buttonChoice2 = findViewById(R.id.choice10);
        buttonChoice3 = findViewById(R.id.choice11);
        buttonChoice4 = findViewById(R.id.choice12);

        updateQuestion();

        buttonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonChoice1.getText().equals(answer)) {
                    score += 1;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(QuizActivity3.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity3.this, "incorrect", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        buttonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonChoice2.getText().equals(answer)) {
                    score += 1;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(QuizActivity3.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity3.this, "incorrect", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        buttonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonChoice3.getText().equals(answer)) {
                    score += 1;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(QuizActivity3.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity3.this, "incorrect", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        buttonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonChoice4.getText().equals(answer)) {
                    score += 1;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(QuizActivity3.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity3.this, "incorrect", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

    }
    private void updateScore(int score) {
        scoreView.setText("" + score);
    }
    private void updateQuestion() {
        questionView.setText(library3.getQuestion(questionNumber));
        buttonChoice1.setText(library3.getChoice1(questionNumber));
        buttonChoice2.setText(library3.getChoice2(questionNumber));
        buttonChoice3.setText(library3.getChoice3(questionNumber));
        buttonChoice4.setText(library3.getChoice4(questionNumber));
        answer = library3.getCorrectAnswer(questionNumber);
        questionNumber++;


    }
}
