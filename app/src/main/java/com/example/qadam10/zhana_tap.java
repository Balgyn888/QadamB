package com.example.qadam10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class zhana_tap extends AppCompatActivity {

    ImageButton CalendarButton;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhana_tap);

        CalendarButton = findViewById(R.id.calendarBtn);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(zhana_tap.this, Calendar.class);
                startActivity(intent);
            }
        });

        CalendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(zhana_tap.this, Calendar.class);
                startActivity(intent);
            }
        });
    }
}