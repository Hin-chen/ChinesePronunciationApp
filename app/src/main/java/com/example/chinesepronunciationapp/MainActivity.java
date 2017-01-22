package com.example.chinesepronunciationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity {
    public final static String QUESTION = "com.example.chinesepronunciationapp.QUESTION";
    public final static String ANSWER = "com.example.chinesepronunciationapp.ANSWER";
    private String question = "";

    public static HashMap<String, String> words = new HashMap<String, String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        words.put("a","啊");
        words.put("b","他");

        RadioButton opt1 = (RadioButton) findViewById(R.id.opt1);
        RadioButton opt2 = (RadioButton) findViewById(R.id.opt2);

        TextView t = (TextView) findViewById(R.id.question);
        question = (String) words.keySet().toArray()[0];

        opt1.setText(words.get(words.keySet().toArray()[0]));
        opt2.setText(words.get(words.keySet().toArray()[1]));
        t.setText(question);


    }

    protected void onRadioButtonClicked(View view) {
        Intent intent = new Intent(this, CheckAnswerActivity.class);
        intent.putExtra(QUESTION, question);

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        String a = "";
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.opt1:
                if (checked)
                    a = words.get(words.keySet().toArray()[0]);

                    break;
            case R.id.opt2:
                if (checked)
                    a = words.get(words.keySet().toArray()[1]);
                    break;
        }
        intent.putExtra(ANSWER, a);
        startActivity(intent);
    }
}
