package com.lizhaoxuan.onceclickdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.OnceClick;
import com.lizhaoxuan.onceclick.OnceInit;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //类似于ButterKnife的Bind方法。初始化OnceClick
        OnceInit.once(this);
        text = (TextView)findViewById(R.id.textView);
    }

    @OnceClick(R.id.btn)
    public void once(){
        text.setText("click"+num++);
        Log.d("tag","once");
    }

    @OnceClick(R.id.btn2)
    public void onceMe(View v){
        ((Button)v).setText("click"+num++);
        Log.d("tag","onceMe");
    }
}
