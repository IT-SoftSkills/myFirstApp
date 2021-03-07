package com.example.togglebuttonapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ConstraintLayout Togglelayout;
ToggleButton TogBtnColor;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TogBtnColor=findViewById(R.id.TogBtnColor);
        Togglelayout=findViewById(R.id.Togglelayout);
        imageView=findViewById(R.id.imageView);

        TogBtnColor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.bulbon));
                    Togglelayout.setBackgroundColor(Color.GREEN);
                }
                else
                {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.bulboff));
                    Togglelayout.setBackgroundColor(Color.BLUE);
                }
            }
        });
    }
}