package com.example.tablayoutproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public class Main3Activity extends AppCompatActivity {
//    Scene s1;
//    Transition transitionMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Log.i("Debug", "Hello this is third Activity");

        // scene
//        ViewGroup lay1 = (ViewGroup)findViewById(R.id.lay1);
//
//        transitionMan = TransitionInflater.from(this).inflateTransition(R.transition.transition);
//
//        s1 = Scene.getSceneForLayout(lay1, R.layout.activity_main5, this);
//
//        s1.enter();

    }


    public void scene(View v){
        Intent i = new Intent(this, Main5Activity.class);
        startActivity(i);
    }



    public void goTo1(View v){
        Intent i = new Intent(this, TabLayoutActivity.class);
        startActivity(i);
    }


    public void goTo2(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }


    public void goTo3(View v){
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);
    }


    public void goTo4(View v){
        Intent i = new Intent(this, Main4Activity.class);
        startActivity(i);
    }


}
