package com.example.the_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.the_project.databinding.ActivityCreateQuizTeacherBinding;

public class CreateQuizTeacherActivity extends AppCompatActivity {

    ActivityCreateQuizTeacherBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_quiz_teacher);
        binding =ActivityCreateQuizTeacherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.IdAddQuestionCreateQuizTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=0;
            }
        });
    }
}