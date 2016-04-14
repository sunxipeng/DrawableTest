package com.sunxipeng.drawabletest;

import android.app.Activity;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final CheckBox shape_checkBox = (CheckBox) findViewById(R.id.shape_checkbox);
        shape_checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (shape_checkBox.isChecked()) {
                    Toast.makeText(MainActivity.this, "我被选中了", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "我被取消选中", Toast.LENGTH_SHORT).show();
                }
            }
        });



        final TextView tv_translate = (TextView) findViewById(R.id.tv_translate);
        tv_translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransitionDrawable transitionDrawable = (TransitionDrawable) tv_translate.getBackground();
                transitionDrawable.startTransition(1000);
            }
        });


        final ImageView iv_clip = (ImageView) findViewById(R.id.iv_clip);
        iv_clip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ClipDrawable clipDrawable = (ClipDrawable) iv_clip.getDrawable();
                clipDrawable.setLevel(5000);
            }
        });
    }
}
