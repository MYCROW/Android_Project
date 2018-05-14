package com.example.crow.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.content.ContentValues.TAG;

public class SecondActivity extends Activity {
    private Button bt1,bt2,bt3;
    static int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        index++;
        Log.i(TAG,SecondActivity.class+"Called onCreate "+index);
        bt1 = (Button)findViewById(R.id.button3);
        bt2 = (Button)findViewById(R.id.button4);
        bt3 = (Button)findViewById(R.id.button5);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//返回上一活动？
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {//返回主界面
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setAction(Intent.ACTION_MAIN);
                it.addCategory(Intent.CATEGORY_HOME);
                startActivity(it);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {//结束当前活动
            @Override
            public void onClick(View v) {
                SecondActivity.this.finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,SecondActivity.class+"Called onStart "+index);
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,SecondActivity.class+"Called onResume "+index);
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,SecondActivity.class+"Called onPause "+index);
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,SecondActivity.class+"Called onStop "+index);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,SecondActivity.class+"Called onDestroy "+index);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,SecondActivity.class+"Called onRestart "+index);
    }
}
