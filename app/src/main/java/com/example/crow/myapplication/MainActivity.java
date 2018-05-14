package com.example.crow.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity
        implements FragmentTest.OnFragmentInteractionListener{
    private Button bt1,bt2;
    static  int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.fragment_fragment_test);
        index++;
        Log.i(TAG,MainActivity.class+"Called onCreate "+index);
        bt1 = (Button)findViewById(R.id.button1);
        bt2 = (Button)findViewById(R.id.button2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setAction(Intent.ACTION_MAIN);
                it.addCategory(Intent.CATEGORY_HOME);
                startActivity(it);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,MainActivity.class+"Called onStart "+index);
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,MainActivity.class+"Called onResume "+index);
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,MainActivity.class+"Called onPause "+index);
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,MainActivity.class+"Called onStop "+index);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,MainActivity.class+"Called onDestroy "+index);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,MainActivity.class+"Called onRestart "+index);
    }

    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }

}
