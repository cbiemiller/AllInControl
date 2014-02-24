package com.cbiemiller.jarvis;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.os.IBinder;
import android.provider.Settings;

public class VolumeManager extends Service
{
	String DEP_BLUETOOTH_ON = Settings.Secure.BLUETOOTH_ON; //Deprecated in API 17
	String BLUETOOTH_ON = Settings.Global.BLUETOOTH_ON; 
	AudioManager am = null;
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
