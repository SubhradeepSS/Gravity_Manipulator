package com.example.gravitycontroller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public ImageView soul,time,mind,power,space,reality;
    public int count=0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soul=(ImageView)findViewById(R.id.soul);
        time=(ImageView)findViewById(R.id.time);
        reality=(ImageView)findViewById(R.id.reality);
        power=(ImageView)findViewById(R.id.power);
        space=(ImageView)findViewById(R.id.space);
        mind=(ImageView)findViewById(R.id.mind);

    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(++count%2==0){
      reverse(soul);
      reverse(space);
      reverse(power);reverse(time);reverse(mind);reverse(reality);
            Toast.makeText(this,"Swipe Up Properly to reverse gravity",Toast.LENGTH_SHORT).show();
        }
        else{
          handleAnimation(soul);handleAnimation(time);handleAnimation(mind);
            handleAnimation(reality);handleAnimation(power);handleAnimation(space);
        Toast.makeText(this,"Swipe Down Properly to restore gravity",Toast.LENGTH_SHORT).show();
        }
        return super.onTouchEvent(event);
    }

    public void handleAnimation(View view){
        ObjectAnimator animatorY1=ObjectAnimator.ofFloat(soul,"y",-50f);
        ObjectAnimator animatorY4=ObjectAnimator.ofFloat(power,"y",-50f);
        ObjectAnimator animatorY2=ObjectAnimator.ofFloat(time,"y",-50f);
        ObjectAnimator animatorY3=ObjectAnimator.ofFloat(reality,"y",-50f);
        ObjectAnimator animatorY5=ObjectAnimator.ofFloat(mind,"y",-50f);
        ObjectAnimator animatorY6=ObjectAnimator.ofFloat(space,"y",-50f);
        animatorY1.setDuration(1000);
        animatorY2.setDuration(1400);
        animatorY3.setDuration(1200);
        animatorY4.setDuration(1800);
        animatorY5.setDuration(1600);
        animatorY6.setDuration(1200);
        AnimatorSet animatorSet=new AnimatorSet();
        animatorSet.playTogether(animatorY1,animatorY2,animatorY3,animatorY4,animatorY5,animatorY6);
        animatorSet.start();
    }
    public void reverse(View view){
        ObjectAnimator animatorY1=ObjectAnimator.ofFloat(soul,"y",1650f);
        ObjectAnimator animatorY4=ObjectAnimator.ofFloat(power,"y",1650f);
        ObjectAnimator animatorY2=ObjectAnimator.ofFloat(time,"y",1650f);
        ObjectAnimator animatorY3=ObjectAnimator.ofFloat(reality,"y",1650f);
        ObjectAnimator animatorY5=ObjectAnimator.ofFloat(mind,"y",1650f);
        ObjectAnimator animatorY6=ObjectAnimator.ofFloat(space,"y",1650f);

        animatorY1.setDuration(1000);
        animatorY2.setDuration(1400);
        animatorY3.setDuration(1200);
        animatorY4.setDuration(1800);
        animatorY5.setDuration(1600);
        animatorY6.setDuration(1200);
        AnimatorSet animatorSet=new AnimatorSet();
        animatorSet.playTogether(animatorY1,animatorY2,animatorY3,animatorY4,animatorY5,animatorY6);
        animatorSet.start();
    }
}
