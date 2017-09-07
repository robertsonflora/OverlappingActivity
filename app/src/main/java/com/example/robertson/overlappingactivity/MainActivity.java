package com.example.robertson.overlappingactivity;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn_Change;
    ImageView iv_Image1, iv_Image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Change = (Button) findViewById(R.id.btnChange);
        iv_Image1 = (ImageView) findViewById(R.id.ivImage1);
        iv_Image2 = (ImageView) findViewById(R.id.ivImage2);

        btn_Change.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(iv_Image1.getVisibility() == View.VISIBLE){
                    iv_Image1.setVisibility(View.GONE);
                    iv_Image2.setVisibility(View.VISIBLE);
                }
                else{
                    iv_Image1.setVisibility(View.VISIBLE);
                    iv_Image2.setVisibility(View.GONE);
                }
            }
        });
    }
}
