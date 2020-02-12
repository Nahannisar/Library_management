package com.example.collegelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NewStudentActivity extends AppCompatActivity {

    private Button btnDone;
    private EditText txtAddress, txtStudentName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_student);

        btnDone = (Button) findViewById(R.id.btn_done);
        txtAddress = (EditText) findViewById(R.id.et_address);
        txtStudentName = (EditText) findViewById(R.id.et_student_name);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtAddress.getText().toString().isEmpty() || txtStudentName.getText().toString().isEmpty())
                {
                    Toast.makeText(NewStudentActivity.this,"Please fill in the fields",Toast.LENGTH_SHORT).show();
                }
                else
                {

                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("name", txtStudentName.getText().toString());
                    resultIntent.putExtra("address", txtAddress.getText().toString());

                    setResult(2, resultIntent);
                    finish();
                }
            }
        });

    }
}
