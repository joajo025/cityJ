package com.example.cityfix10;

import android.app.NotificationChannel;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ViewAnimator;


public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onCheckboxClicked(View view){
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check if checkbox was clicked
        switch(view.getId()){
            case R.id.checkbox_admin:
                if(checked){
                    adminCheck(1);
                }
                else{
                    adminCheck(0);
                }
                break;
            case R.id.checkbox_objects:
                if(checked){

                }
                else{

                }
            case R.id.checkbox_other:
                if(checked){

                }
                else{

                }
            case R.id.checkbox_safety:
                if(checked){

                }
                else{

                }
            case R.id.checkbox_gamla:
                if(checked){

                }
                else{

                }
            case R.id.checkbox_nord:
                if(checked){

                }
                else{

                }
        }
    }

    public boolean adminCheck(int c){
        if(c == 1){
            return true;
        }
        else
            return false;
    }

}
