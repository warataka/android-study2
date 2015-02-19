package com.example.skill.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        //Log.d("wara","getAcion:"+ intent.getAction());
        //TODO:飛んできたBroadcastReceiver受信
        Log.i("wara","receive1");
        Intent activity = new Intent();

        activity.setClass(context,MainActivity_210_broad.class);
        activity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        //TODO:飛んできたintentから新しいintent(activity)に文字列を設定
        //TODO:ここで詰まった。。。intent.getStringExtra("text_data")はあってる？
        //Todo:intentから文字列を取得して、その文字列をactivityに設定するという意味ではあってる思うが・・・
        activity.putExtra("text_data", intent.getStringExtra("text_data"));
        //String text_receiver = intent.getStringExtra("text_data");
        //Log.i("wara", text_receiver);

        //TODO:MainActivity_210_broadにを呼び出す。
        context.startActivity(activity);


    }
}
