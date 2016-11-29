package com.example.user.lab33togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleOnOff;
    ImageView imageViewIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewIcon = (ImageView)findViewById(R.id.imageViewIcon);
    }
    public void showPicture(View v){
        boolean on = ((ToggleButton)v).isChecked();

        if(on)
            imageViewIcon.setVisibility(View.VISIBLE);
        else
            imageViewIcon.setVisibility(View.INVISIBLE); }
}
