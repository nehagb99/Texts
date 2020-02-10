package com.bagalkotneha.texts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button submitButton;
    EditText responseText;
    TextView displayText;
    Button messagesButton;
    TextView messagesText;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.clickButton);
        messagesButton = findViewById(R.id.clickButton2);
        responseText = findViewById(R.id.responseEditText);
        displayText = findViewById(R.id.textBox);
        messagesText = findViewById(R.id.textBox2);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText(responseText.getText().toString());
            }
        });
        Resources res = getResources();
        final String[] messages = res.getStringArray(R.array.messages_array);
        messagesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messagesText.setText(messages[count]);
                count++;
                if (count == messages.length) {
                    count = 0;
                }
            }
        });
    }
}