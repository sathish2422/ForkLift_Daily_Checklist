package com.example.forkliftdailychecklist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

public class DailyChecklist extends AppCompatActivity {

    ImageButton Submit;
    CheckBox checkBox,checkBox2,checkBox3,checkBox4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_checklist);
        Submit=(ImageButton) findViewById(R.id.checkbutton);
        checkBox=(CheckBox) findViewById(R.id.checkBox);
        checkBox2=(CheckBox) findViewById(R.id.checkBox2);
        checkBox3=(CheckBox) findViewById(R.id.checkBox3);
        checkBox4=(CheckBox) findViewById(R.id.checkBox4);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()&&checkBox2.isChecked()&&checkBox3.isChecked()&&checkBox4.isChecked()){
                    startActivity(new Intent(DailyChecklist.this, EndChecklist.class));
                    Toast.makeText(DailyChecklist.this, "Start Your Work", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(DailyChecklist.this, "Please filling the checkbox", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}