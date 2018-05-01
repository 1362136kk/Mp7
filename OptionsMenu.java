package edu.illinois.cs.cs125.cs125mp7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.RadioButton;

public class OptionsMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu);

        RadioButton uno = findViewById(R.id.computers);
        RadioButton dos = findViewById(R.id.math);
        RadioButton tres = findViewById(R.id.nature);

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent(OptionsMenu.this, MainActivity.class);
                intent.putExtra("info",1);
                startActivity(intent);
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent(OptionsMenu.this, MainActivity.class);
                intent.putExtra("info",2);
                startActivity(intent);
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent(OptionsMenu.this, MainActivity.class);
                intent.putExtra("info",3);
                startActivity(intent);
            }
        });
    }
}
