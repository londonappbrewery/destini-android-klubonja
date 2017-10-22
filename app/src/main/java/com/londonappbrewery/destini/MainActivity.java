package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    int currentStory = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView mStoryText = (TextView) findViewById(R.id.storyTextView);
        final Button mButtonTop = (Button) findViewById(R.id.buttonTop);
        final Button mButtonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentStory == 1) {
                    mStoryText.setText(R.string.T3_Story);
                    mButtonBottom.setText(R.string.T3_Ans1);
                    mButtonTop.setText(R.string.T3_Ans2);
                    currentStory = 3;
                } else if (currentStory == 2) {
                    mStoryText.setText(R.string.T3_Story);
                    mButtonBottom.setText(R.string.T3_Ans1);
                    mButtonTop.setText(R.string.T3_Ans2);
                    currentStory = 3;
                } else {
                    mStoryText.setText(R.string.T6_End);
                    ((ViewGroup) mButtonBottom.getParent()).removeView(mButtonBottom);
                    ((ViewGroup) mButtonTop.getParent()).removeView(mButtonTop);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentStory == 1) {
                    mStoryText.setText(R.string.T2_Story);
                    mButtonBottom.setText(R.string.T2_Ans1);
                    mButtonTop.setText(R.string.T2_Ans2);
                    currentStory = 2;
                } else if (currentStory == 2) {
                    mStoryText.setText(R.string.T4_End);
                    ((ViewGroup) mButtonBottom.getParent()).removeView(mButtonBottom);
                    ((ViewGroup) mButtonTop.getParent()).removeView(mButtonTop);
                } else {
                    mStoryText.setText(R.string.T5_End);
                    ((ViewGroup) mButtonBottom.getParent()).removeView(mButtonBottom);
                    ((ViewGroup) mButtonTop.getParent()).removeView(mButtonTop);
                }

            }
        });


    }
}
