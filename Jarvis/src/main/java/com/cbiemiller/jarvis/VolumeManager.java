package com.cbiemiller.jarvis;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.os.IBinder;
import android.provider.Settings;

public class VolumeManager extends Service
{
    /***
     *
     * Fill in this Service with an interface to Android AudioManager
     * Leave learning methods to another Service.
     *
     */
    @Override
    public IBinder onBind(Intent intent) {
        return null;
        AudioManager
        //remove once used
        Settings.Secure
    }

}