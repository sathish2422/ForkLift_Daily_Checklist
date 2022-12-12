package com.example.forkliftdailychecklist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

public class EndChecklist extends AppCompatActivity {

    ImageButton Submit;
    CheckBox checkBox,checkBox2,checkBox3,checkBox4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_checklist);

        Submit=(ImageButton) findViewById(R.id.checkbutton);
        checkBox=(CheckBox) findViewById(R.id.checkBox);
        checkBox2=(CheckBox) findViewById(R.id.checkBox2);
        checkBox3=(CheckBox) findViewById(R.id.checkBox3);
        checkBox4=(CheckBox) findViewById(R.id.checkBox4);




        Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (checkBox.isChecked() && checkBox2.isChecked() && checkBox3.isChecked() && checkBox4.isChecked()) {
                        startActivity(new Intent(EndChecklist.this, FirstPage.class));
                        Toast.makeText(EndChecklist.this, "Your Work Will Be Done", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(EndChecklist.this, "Please filling the checkbox", Toast.LENGTH_SHORT).show();

                    }
                }
        });

    }
}