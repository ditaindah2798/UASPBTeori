package com.example.uasfix;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

class about extends FragmentActivity implements View.OnClickListener {

    Button bt_about, btn_goal;
    About about;
    Goal goal     ;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_application);

        bt_about = (Button) findViewById(R.id.btab);
        btn_goal = (Button) findViewById(R.id.btngl);

        bt_about.setOnClickListener(this);
        btn_goal.setOnClickListener(this);
    }

    void mAbout(){
        about = new About();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.container, about);
    }
    void mGoal(){
        goal = new Goal();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.container, goal);
    }

    @Override
    public void onClick(View v) {
        if (v == bt_about){
            mAbout();
        }
        if (v == btn_goal){
            mGoal();
        }

    }

}