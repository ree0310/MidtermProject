package com.example.tablayoutproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public class Main3Activity extends AppCompatActivity {
    Scene s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Log.i("Debug", "Hello this is third Activity");

        // scene
        ViewGroup lay1 = (ViewGroup)findViewById(R.id.lay1); // lay2는 시작하는 레이아웃의 id이다. ViewGroup이라고 타입을 지정해주면 오류가 사라진다. lay2라는 것을 vg에 넣고 그 vg를 밑에 있는 줄에서 사용한다.
        s1 = Scene.getSceneForLayout(lay1, R.layout.activity_main3, this); // vg에서 main2로 가라~!! getSceneForLayout(ViewGroup layoutId, context)에서 getSceneForLayout은 여기 layout을 끄집어내라.
        s1.enter();

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
