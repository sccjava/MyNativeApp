package com.harman.mynativeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.harman.mynativeapp.api.PlayerAPI;
import com.harman.mylib.MyLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MyLib myLib = MyLib.getInstance();
        int jniRet = PlayerAPI.getInstance().create();
        int libRet = myLib.create();

        TextView txt = (TextView)findViewById(R.id.txt);
        txt.setText("Hello World ! jni ret=" + jniRet + ", lib ret="+ libRet);

        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerAPI.getInstance().create();
                myLib.create();
            }
        });
    }
}
