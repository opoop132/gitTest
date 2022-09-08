package com.example.shcool0908;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView roulet;
    float startdegree, enddegree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roulet=findViewById(R.id.roulet);

    }
    public void rotate(View v){
        startdegree=enddegree;
        Random r = new Random();
        int randomdegree = r.nextInt(360);
        enddegree=startdegree+1080+randomdegree;
        ObjectAnimator object = ObjectAnimator.ofFloat(roulet,"rotation",startdegree,enddegree);
        object.setInterpolator(new AccelerateDecelerateInterpolator());
        object.setDuration(2000);
        object.start();
    }
}