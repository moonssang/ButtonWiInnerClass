package com.smuexample.buttonwiinnerclass;

import android.view.View;

public class MyOnClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v){
        mainActivity.mTextview1.setText("You Click 문현화 button");

    }
}
