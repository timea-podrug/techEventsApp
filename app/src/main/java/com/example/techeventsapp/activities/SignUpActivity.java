package com.example.techeventsapp.activities;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.techeventsapp.R;


import android.view.View;

import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class SignUpActivity extends AppCompatActivity {

    private EditText editTextName;
    private CheckBox checkBox18;
    private RadioGroup radioGroupStatus;
    private RadioButton radioButtonPupil, radioButtonStudent, radioButtonOther;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        editTextName = findViewById(R.id.editTextName);
        checkBox18 = findViewById(R.id.checkBox18);
        radioGroupStatus = findViewById(R.id.radioGroupStatus);
        radioButtonPupil = findViewById(R.id.radioButtonPupil);
        radioButtonStudent = findViewById(R.id.radioButtonStudent);
        radioButtonOther = findViewById(R.id.radioButtonOther);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSubmit();
            }
        });
    }

    private void handleSubmit() {
        String name = editTextName.getText().toString();
        boolean is18OrOlder = checkBox18.isChecked();
        int selectedStatusId = radioGroupStatus.getCheckedRadioButtonId();

        if (name.isEmpty() || selectedStatusId == -1) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        String status;
        if (selectedStatusId == R.id.radioButtonPupil) {
            status = "Pupil";
        } else if (selectedStatusId == R.id.radioButtonStudent) {
            status = "Student";
        } else {
            status = "Other";
        }
        Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
        startActivity(intent);
        finish();

        String message = "Name: " + name + "\n" +
                "Is 18 or older: " + is18OrOlder + "\n" +
                "Status: " + status;
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
