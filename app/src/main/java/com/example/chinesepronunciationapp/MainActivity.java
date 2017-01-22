package com.example.chinesepronunciationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    HashMap<String, String> words = new HashMap<String, String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        words.put("a","say");
        words.put("b","bee");

        RadioButton opt1 = (RadioButton) findViewById(R.id.opt1);
        RadioButton opt2 = (RadioButton) findViewById(R.id.opt2);

        opt1.setText(words.get(words.keySet().toArray()[0]));
        opt2.setText(words.get(words.keySet().toArray()[1]));


    }

    protected void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.opt1:
                if (checked)
                    // option1

                    break;
            case R.id.opt2:
                if (checked)
                    // option2
                    break;
        }

    }
}
