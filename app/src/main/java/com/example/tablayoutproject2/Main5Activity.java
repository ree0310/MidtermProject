package com.example.tablayoutproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

public class Main5Activity extends AppCompatActivity {

    Transition transitionMan;
    Scene s1;
//    Scene s2;
    ViewGroup lay1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        lay1 = (ViewGroup)findViewById(R.id.lay1);

        transitionMan = TransitionInflater.from(this).inflateTransition(R.transition.transition);

        s1 = Scene.getSceneForLayout(lay1, R.layout.scene, this);

//        s2 = Scene.getSceneForLayout(lay1, R.layout.scene, this);

        s1.enter();
    }


    public void scene(View v){
        TransitionManager.go(s1, transitionMan);
    }

//    public void goToScene1(View v){
//        TransitionManager.go(s1, transitionMan);
//    }
//
//    public void goToScene2(View v){
//        TransitionManager.go(s2, transitionMan);
//    }


    public void goTo3(View vi){
        Intent i = new Intent(this , Main3Activity.class);
        startActivity(i);
    }

}
