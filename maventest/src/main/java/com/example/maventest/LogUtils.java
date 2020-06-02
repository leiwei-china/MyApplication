package com.example.maventest;

import android.content.Context;
import android.widget.Toast;

import com.alivc.rtc.AliRtcEngine;

public class LogUtils {

    public static AliRtcEngine showLongTwo(Context context, String text) {
//        safeShow(context, text, Toast.LENGTH_LONG);
        AliRtcEngine aliRtcEngine =  AliRtcEngine.getInstance(context);

        return aliRtcEngine;
    }
}
