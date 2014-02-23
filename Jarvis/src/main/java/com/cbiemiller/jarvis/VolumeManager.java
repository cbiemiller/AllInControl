package com.cbiemiller.jarvis;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

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
    }
}