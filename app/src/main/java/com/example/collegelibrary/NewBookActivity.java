package com.example.collegelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class NewBookActivity extends AppCompatActivity {

    private EditText txtAuthor, txtBookName, txtDescription, txtFullDescription;
    private Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_book);

        btnDone = (Button) findViewById(R.id.btn_done);
        txtAuthor = (EditText) findViewById(R.id.et_author);
        txtDescription = (EditText) findViewById(R.id.et_description);
        txtFullDescription = (EditText) findViewById(R.id.et_full_description);
        txtBookName = (EditText) findViewById(R.id.et_book_name);


        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtAuthor.getText().toString().isEmpty() || txtBookName.getText().toString().isEmpty() ||
                        txtDescription.toString().isEmpty() || txtFullDescription.toString().isEmpty())
                {
                    Toast.makeText(NewBookActivity.this,"Please fill in the fields",Toast.LENGTH_SHORT).show();
                }
                else
                {

                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("book", txtBookName.getText().toString());
                    resultIntent.putExtra("author", txtAuthor.getText().toString());
                    resultIntent.putExtra("description", txtDescription.getText().toString());
                    resultIntent.putExtra("full_description", txtFullDescription.getText().toString());

                    setResult(12, resultIntent);
                    finish();
                }
            }
        });

    }
}
