package com.example.uasfix;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class homepage extends AppCompatActivity implements View.OnClickListener {
        private Button BtnChooseYourStory;
        private Button BtnApplication;
        private Button BtnAboutMeMore;
        private Button BtnComment;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_homepage);

            BtnChooseYourStory = findViewById(R.id.B_ChooseYourStory);
            BtnApplication = findViewById(R.id.Btn_Application);
            BtnAboutMeMore = findViewById(R.id.Bt_AboutMeMore);
            BtnComment = findViewById(R.id.Btn_Comment);

            BtnChooseYourStory.setOnClickListener(this);
            BtnApplication.setOnClickListener(this);
            BtnAboutMeMore.setOnClickListener(this);
            BtnComment.setOnClickListener(this);

        }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.B_ChooseYourStory:
                startActivity(new Intent(this, ChooseYourStory.class));
                break;
        }

        switch (view.getId()) {
            case R.id.Btn_Application:
                startActivity(new Intent(this, about.class));
                break;
        }
        switch (view.getId()) {
            case R.id.Bt_AboutMeMore:
                startActivity(new Intent(this, AboutMeMore.class));
                break;
        }
        switch (view.getId()) {
            case R.id.Btn_Comment:
                startActivity(new Intent(this, Comment.class));
                break;
        }

            }
        }
