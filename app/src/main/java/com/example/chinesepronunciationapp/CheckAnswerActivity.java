package com.example.chinesepronunciationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CheckAnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_answer);
        String result = "";
        Intent intent = getIntent();
        String q = intent.getStringExtra(MainActivity.QUESTION);
        String a = intent.getStringExtra(MainActivity.ANSWER);
        if (MainActivity.words.get(q).equals(a)) {
            result = "Correct!";
        } else {
            result = "Incorrect";
        }
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(result);

    }
    protected void sendBack(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
