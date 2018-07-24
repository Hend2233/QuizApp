package com.example.tito.quizeapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    int correct;

    public void submitResult(View v) {
        // Reset the correct score if the user clicked the submit button again
        correct = 0;

        CheckBox question1_option1 = findViewById(R.id.question_1_option_1);
        CheckBox question1_option2 = findViewById(R.id.question_1_option_2);
        CheckBox question1_option3 = findViewById(R.id.question_1_option_3);
        question1_option1.setTextColor(Color.BLACK);
        question1_option2.setTextColor(Color.BLACK);
        question1_option3.setTextColor(Color.BLACK);
        // Option 1 and 3 will be green if they checked
        // If option 2 is selected it would show that as a wrong answer
        if (question1_option1.isChecked() && question1_option3.isChecked() && !question1_option2.isChecked()) {
            correct += 1;
            question1_option1.setTextColor(Color.parseColor("#008800"));
            question1_option3.setTextColor(Color.parseColor("#008800"));
        } else {
            // The correct answer
            question1_option1.setTextColor(Color.parseColor("#008800"));
            question1_option3.setTextColor(Color.parseColor("#008800"));
            // The wrong answer
            question1_option2.setTextColor(Color.parseColor("#FF0000"));
        }
        RadioButton question2_option1 = findViewById(R.id.question_2_option_1);
        RadioButton question2_option2 = findViewById(R.id.question_2_option_2);
        RadioButton question2_option3 = findViewById(R.id.question_2_option_3);
        question2_option1.setTextColor(Color.BLACK);
        question2_option2.setTextColor(Color.BLACK);
        question2_option3.setTextColor(Color.BLACK);
        // Option 3 will be green if it checked
        if(question2_option3.isChecked()) {
            correct +=1;
            question2_option3.setTextColor(Color.parseColor("#008800"));
        }else {
            // The correct answer
            question2_option3.setTextColor(Color.parseColor("#008800"));
            // Wrong answer in red
            question2_option2.setTextColor(Color.parseColor("#FF0000"));
            // Wrong answer in red
            question2_option1.setTextColor(Color.parseColor("#FF0000"));
        }

       EditText question3 = findViewById(R.id.question_3);
       String checkAnswer3 = question3.getText().toString();
       // If the answer was Arigatou it would be green
        if(checkAnswer3.equalsIgnoreCase("Arigatou")) {
            correct = correct +1;
            question3.setTextColor(Color.parseColor("#008800"));
        }else {
            // If not it would be red
            question3.setTextColor(Color.parseColor("#FF0000"));
        }

        RadioButton question4_option1 = findViewById(R.id.question_4_option_1);
        RadioButton question4_option2 = findViewById(R.id.question_4_option_2);
        RadioButton question4_option3 = findViewById(R.id.question_4_option_3);
        question4_option1.setTextColor(Color.BLACK);
        question4_option2.setTextColor(Color.BLACK);
        question4_option3.setTextColor(Color.BLACK);
        // Option 1 will be green
        if(question4_option1.isChecked()) {
            correct = correct +1;
            question4_option1.setTextColor(Color.parseColor("#008800"));
        }else {
            // The correct answer
            question4_option1.setTextColor(Color.parseColor("#008800"));
            // The wrong answer
            question4_option2.setTextColor(Color.parseColor("#FF0000"));
            // The wrong answer
            question4_option3.setTextColor(Color.parseColor("#FF0000"));
        }

        EditText question5 = findViewById(R.id.question_5);
        String checkAnswerF1 = question5.getText().toString();
        // If the answer was Neko it would be green
        if(checkAnswerF1.equalsIgnoreCase("Neko")) {
            correct = correct +1;
            question5.setTextColor(Color.parseColor("#008800"));
        } else {
            // If not it would be red
            question5.setTextColor(Color.parseColor("#FF0000"));
        }

        CheckBox question6_option1 = findViewById(R.id.question_6_option_1);
        CheckBox question6_option2 = findViewById(R.id.question_6_option_2);
        CheckBox question6_option3 = findViewById(R.id.question_6_option_3);
        question6_option1.setTextColor(Color.BLACK);
        question6_option2.setTextColor(Color.BLACK);
        question6_option3.setTextColor(Color.BLACK);
        // Option 1 and 2 will be green
        if(question6_option1.isChecked() && question6_option2.isChecked() && !question6_option3.isChecked()) {
            correct = correct +1;
            question6_option1.setTextColor(Color.parseColor("#008800"));
            question6_option2.setTextColor(Color.parseColor("#008800"));
        } else {
            // The correct answer
            question6_option1.setTextColor(Color.parseColor("#008800"));
            question6_option2.setTextColor(Color.parseColor("#008800"));
            // The wrong answer
            question6_option3.setTextColor(Color.parseColor("#FF0000"));
        }

        EditText question7 = findViewById(R.id.question_7);
        String checkAnswerG1 = question7.getText().toString();
        // If the answer was Red it would be green
        if(checkAnswerG1.equalsIgnoreCase("Red")) {
            correct = correct +1;
            question7.setTextColor(Color.parseColor("#008800"));
        } else {
            // The wrong answer
            question7.setTextColor(Color.parseColor("#FF0000"));
        }
        RadioButton question8_option1 = findViewById(R.id.question_8_option_1);
        RadioButton question8_option2 = findViewById(R.id.question_8_option_2);
        RadioButton question8_option3 = findViewById(R.id.question_8_option_3);
        question8_option1.setTextColor(Color.BLACK);
        question8_option2.setTextColor(Color.BLACK);
        question8_option3.setTextColor(Color.BLACK);
        // Option 2 will be green
        if(question8_option2.isChecked()) {
            correct = correct +1;
            question8_option2.setTextColor(Color.parseColor("#008800"));
        } else {
            // The correct answer
            question8_option2.setTextColor(Color.parseColor("#008800"));
            // The wrong answer
            question8_option1.setTextColor(Color.parseColor("#FF0000"));
            // The wrong answer
            question8_option3.setTextColor(Color.parseColor("#FF0000"));
        }

        CheckBox question9_option2 = findViewById(R.id.question_9_option_2);
        CheckBox question9_option3 = findViewById(R.id.question_9_option_3);
        CheckBox question9_option1 = findViewById(R.id.question_9_option_1);
        question9_option1.setTextColor(Color.BLACK);
        question9_option2.setTextColor(Color.BLACK);
        question9_option3.setTextColor(Color.BLACK);
        // Option 2 and 3 will be green
        if(question9_option2.isChecked() && question9_option3.isChecked() && !question9_option1.isChecked()) {
            correct = correct +1;
            question9_option2.setTextColor(Color.parseColor("#008800"));
            question9_option3.setTextColor(Color.parseColor("#008800"));
        } else {
            // The correct answer
            question9_option2.setTextColor(Color.parseColor("#008800"));
            question9_option3.setTextColor(Color.parseColor("#008800"));
            // The wrong answer
            question9_option1.setTextColor(Color.parseColor("#FF0000"));
        }

        RadioButton question10_option1 = findViewById(R.id.question_10_option_1);
        RadioButton question10_option2 = findViewById(R.id.question_10_option_2);
        RadioButton question10_option3 = findViewById(R.id.question_10_option_3);
        question10_option1.setTextColor(Color.BLACK);
        question10_option2.setTextColor(Color.BLACK);
        question10_option3.setTextColor(Color.BLACK);
        // option 3 will be green
        if(question10_option3.isChecked()) {
            correct = correct +1;
            question10_option3.setTextColor(Color.parseColor("#008800"));
        } else {
            // The correct answer
            question10_option3.setTextColor(Color.parseColor("#008800"));
            // The wrong answer
            question10_option2.setTextColor(Color.parseColor("#FF0000"));
            // The wrong answer
            question10_option1.setTextColor(Color.parseColor("#FF0000"));
        }

        if (correct >=0 && correct <= 4) {
            Toast.makeText(this, "You have got " + correct + "/10 Don't give up", Toast.LENGTH_SHORT).show();
        } else if(correct >= 5 && correct <= 8) {
            Toast.makeText(this, "You have got " + correct + "/10 Keep going", Toast.LENGTH_SHORT).show();
        } else if (correct >= 9 && correct <= 10) {
            Toast.makeText(this, "You have got " + correct + "/10 Excellent!", Toast.LENGTH_SHORT).show();
        }
    }

    public void resetAll(View view) {
        correct = 0;

        // Ready to Clear EditTexts
        EditText question3 = findViewById(R.id.question_3);
        EditText question5 = findViewById(R.id.question_5);
        EditText question7 = findViewById(R.id.question_7);
        // Clear EditTexts
        question3.setText("");
        question5.setText("");
        question7.setText("");
        // Reset the colors
        question3.setTextColor(Color.BLACK);
        question5.setTextColor(Color.BLACK);
        question7.setTextColor(Color.BLACK);

        // Ready to clear CheckBoxes for question 1
        CheckBox question1_option1 = findViewById(R.id.question_1_option_1);
        CheckBox question1_option2 = findViewById(R.id.question_1_option_2);
        CheckBox question1_option3 = findViewById(R.id.question_1_option_3);
        // CheckBoxes for question 6
        CheckBox question6_option1 = findViewById(R.id.question_6_option_1);
        CheckBox question6_option2 = findViewById(R.id.question_6_option_2);
        CheckBox question6_option3 = findViewById(R.id.question_6_option_3);
        // CheckBoxes for question 9
        CheckBox question9_option2 = findViewById(R.id.question_9_option_2);
        CheckBox question9_option3 = findViewById(R.id.question_9_option_3);
        CheckBox question9_option1 = findViewById(R.id.question_9_option_1);
        // Clear CheckBoxes
        question1_option1.setChecked(false);
        question1_option2.setChecked(false);
        question1_option3.setChecked(false);
        question6_option1.setChecked(false);
        question6_option2.setChecked(false);
        question6_option3.setChecked(false);
        question9_option1.setChecked(false);
        question9_option2.setChecked(false);
        question9_option3.setChecked(false);
        // Reset the colors
        question1_option1.setTextColor(Color.BLACK);
        question1_option2.setTextColor(Color.BLACK);
        question1_option3.setTextColor(Color.BLACK);
        question6_option1.setTextColor(Color.BLACK);
        question6_option2.setTextColor(Color.BLACK);
        question6_option3.setTextColor(Color.BLACK);
        question9_option1.setTextColor(Color.BLACK);
        question9_option2.setTextColor(Color.BLACK);
        question9_option3.setTextColor(Color.BLACK);

        // Ready to clear RadioBoxes for question 2
        RadioGroup Group1 = findViewById(R.id.group1);
        // RadioBoxes for question 4
        RadioGroup Group2 = findViewById(R.id.group2);
        // RadioBoxes for question 8
        RadioGroup Group3 = findViewById(R.id.group3);
        // RadioBoxes for question 10
        RadioGroup Group4 = findViewById(R.id.group4);
        // Clear RadioBoxes
        Group1.clearCheck();
        Group2.clearCheck();
        Group3.clearCheck();
        Group4.clearCheck();
        // Reset the colors for group 1
        RadioButton question2_option1 = findViewById(R.id.question_2_option_1);
        RadioButton question2_option2 = findViewById(R.id.question_2_option_2);
        RadioButton question2_option3 = findViewById(R.id.question_2_option_3);
        question2_option1.setTextColor(Color.BLACK);
        question2_option2.setTextColor(Color.BLACK);
        question2_option3.setTextColor(Color.BLACK);

        // Reset colors for group 2
        RadioButton question4_option1 = findViewById(R.id.question_4_option_1);
        RadioButton question4_option2 = findViewById(R.id.question_4_option_2);
        RadioButton question4_option3 = findViewById(R.id.question_4_option_3);
        question4_option1.setTextColor(Color.BLACK);
        question4_option2.setTextColor(Color.BLACK);
        question4_option3.setTextColor(Color.BLACK);

        // Reset colors for group 3
        RadioButton question8_option1 = findViewById(R.id.question_8_option_1);
        RadioButton question8_option2 = findViewById(R.id.question_8_option_2);
        RadioButton question8_option3 = findViewById(R.id.question_8_option_3);
        question8_option1.setTextColor(Color.BLACK);
        question8_option2.setTextColor(Color.BLACK);
        question8_option3.setTextColor(Color.BLACK);

        // Reset colors for group 4
        RadioButton question10_option1 = findViewById(R.id.question_10_option_1);
        RadioButton question10_option2 = findViewById(R.id.question_10_option_2);
        RadioButton question10_option3 = findViewById(R.id.question_10_option_3);
        question10_option1.setTextColor(Color.BLACK);
        question10_option2.setTextColor(Color.BLACK);
        question10_option3.setTextColor(Color.BLACK);
    }
}
