package edu.illinois.cs.cs125.cs125mp7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button newGame = findViewById(R.id.newgame);
        newGame.setOnClickListener(new View.OnClickListener() {
                @Override
            public void onClick(final View v) {
                Log.d("CS125MP7","Game has started");
                Intent intent = getIntent();
                if(intent.getIntExtra("info",0) == 1) {
                    startActivity(new Intent(MainActivity.this,QuizActivity2.class));
                } else if(intent.getIntExtra("info",0) == 2) {
                    startActivity(new Intent(MainActivity.this, QuizActivity.class));
                } else {
                    startActivity(new Intent(MainActivity.this, QuizActivity3.class));
                }
            }
        });
        final Button options = findViewById(R.id.options);
        options.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d("CS125MP7","Options menu opened");
                Intent intent = new Intent(MainActivity.this, OptionsMenu.class);
                startActivity(intent);
            }
        });

    }

}
