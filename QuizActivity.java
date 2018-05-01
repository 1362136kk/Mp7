package edu.illinois.cs.cs125.cs125mp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.animation.Animator;

public class QuizActivity extends AppCompatActivity {
    private MathQuestionLibrary library = new MathQuestionLibrary();
    private TextView scoreView;
    private TextView questionView;
    private Button buttonChoice1;
    private Button buttonChoice2;
    private Button buttonChoice3;
    private Button buttonChoice4;

    private String answer = "";
    private int score;
    private int questionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        scoreView = findViewById(R.id.score);
        questionView = findViewById(R.id.question1);
        buttonChoice1 = findViewById(R.id.choice1);
        buttonChoice2 = findViewById(R.id.choice2);
        buttonChoice3 = findViewById(R.id.choice3);
        buttonChoice4 = findViewById(R.id.choice4);

        updateQuestion();

        buttonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonChoice1.getText().equals(answer)) {
                    score += 1;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

    }
    private void updateScore(int score) {
        scoreView.setText("" + score);
    }
    private void updateQuestion() {
        if (questionNumber == library.numQ()) {
            startActivity(new Intent(QuizActivity.this, MainActivity.class));
            return;
        }
        questionView.setText(library.getQuestion(questionNumber));
        buttonChoice1.setText(library.getChoice1(questionNumber));
        buttonChoice2.setText(library.getChoice2(questionNumber));
        buttonChoice3.setText(library.getChoice3(questionNumber));
        buttonChoice4.setText(library.getChoice4(questionNumber));
        answer = library.getCorrectAnswer(questionNumber);
        questionNumber++;
    }
}
