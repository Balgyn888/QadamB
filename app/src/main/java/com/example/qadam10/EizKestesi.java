package com.example.qadam10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class EizKestesi extends AppCompatActivity {

    Button TolykBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eiz_kestesi);


    TolykBtn = findViewById(R.id.btn8);

    TolykBtn.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick (View v){
        openDialog();
    }
    });
}
    private void openDialog(){
       DialogFragment dialogFragment = new DialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "example");
    }
}