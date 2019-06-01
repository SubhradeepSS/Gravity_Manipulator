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

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public ImageView soul,time,mind,power,space,reality;
    public int count=0;
    Random r,r1;

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
        r=new Random();
        final int a=r.nextInt(10);
        if(++count%2==0){
             reverse(soul);
            reverse(space);
            reverse(power);
           reverse(time);
          reverse(mind);
           reverse(reality);
        }
        else{

          handleAnimation(soul);
                handleAnimation(time);
                handleAnimation(mind);
                handleAnimation(reality);
                handleAnimation(power);
                handleAnimation(space);
        }
        return super.onTouchEvent(event);
    }

    public void handleAnimation(View view){
        r=new Random();
        final int a=r.nextInt(6);
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
        if(a==1)
            animatorSet.playTogether(animatorY1);
        else if(a==2)
            animatorSet.playTogether(animatorY2);
        else if(a==3)
            animatorSet.playTogether(animatorY3);
        else if(a==4)
            animatorSet.playTogether(animatorY4);
        else if(a==5)
            animatorSet.playTogether(animatorY5);
        else
            animatorSet.playTogether(animatorY6);
        animatorSet.start();
    }
    public void reverse(View view){
        r1=new Random();
        final int a1=r1.nextInt(6)+7;
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
        if(a1==11)
            animatorSet.playTogether(animatorY1);
        else if(a1==7)
            animatorSet.playTogether(animatorY2);
        else if(a1==8)
            animatorSet.playTogether(animatorY3);
        else if(a1==9)
            animatorSet.playTogether(animatorY4);
        else if(a1==10)
            animatorSet.playTogether(animatorY5);
        else
            animatorSet.playTogether(animatorY6);
        animatorSet.start();
    }
}
