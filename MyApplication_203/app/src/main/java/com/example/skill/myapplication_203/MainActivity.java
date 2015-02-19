package com.example.skill.myapplication_203;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);

        btn.setOnClickListener(new View.OnClickListener() {


            public static final int RESULT_CODE_1 = 1;

            @Override
            public void onClick(View v) {


                //TODO:edittextから文字取得
                EditText editText = (EditText)findViewById(R.id.edittext);
                String text = editText.getText().toString();
                Log.i("wara","click");

                //TODO:受け渡し用の箱(intent)
                Intent intent = new Intent();
                Log.i("wara","click2");
                //intent.setClassName(getApplicationContext(), "com.example.skill.myapplication_203.BROADCASTSAMPLE2");

                //TODO:editから取得したtextをintentに設定(？)
                intent.putExtra("text_data",text);
                Log.i("wara","click3");

                //TODO:どこから飛んできたか分かるようにPASS(?)設定
                intent.setAction("com.example.skill.myapplication_203.BROADCASTSAMPLE");

                //TODO:BroadcastReceiverに送信
                sendBroadcast(intent);
                //  intent.setClassName("com.google.android.GoogleCamera", "com.android.camera.CameraLauncher");
                //startActivityForResult(intent, RESULT_CODE_1);
                Log.i("wara","click4");
            }
        });
        
        
        // ((Button)findViewById(R.id.button).setOnClickListener(this));

        //((Button)findViewById(R.id.button2).setOnClickListener(this));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //private static final String ACTION_BROADCAST_EVENT = "com.example.skill.myapplication_203" + ".BROADCASTSAMPLE";

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button: {
                Intent intent = new Intent();
                // intent.setAction(ACTION_BROADCAST_EVENT);

                intent.setAction("com.example.skill.myapplication_203.BROADCASTSAMPLE");
                sendBroadcast(intent);
                break;
            }
          //  case R.id.button2: {
           //     //TODO; Serviceの呼び出し
           //     MyIntentService.startActionBroadcast(getApplicationContext());
            //    break;
           // }

        }
    }
}
