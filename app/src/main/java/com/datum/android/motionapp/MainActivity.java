package com.datum.android.motionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Def:
         * @Motion_Scene = xml file that defines all animations for the scene (it can be defined programmatically also)
         *
         * @ConstraintSet = xml tag that acting as the resting state of our motion scenes
         *
         * @Transition = xml tag that defines the way in which two states will be transformed between
         *
         */


        /**
         *  How to do:
         *
         *  TODO 1: add dependency
         *  TODO 2: create a new motion layout file
         *  TODO 3: create a new motion scene file in xml folder
         *  TODO 4: link motion scene with motion layout file by app:layoutDescription="@xml/motion_scene"
         *  TODO 5: set tools:showPaths="true" in the root of motion layout > kinda debugging tool
         *
         */
    }
}