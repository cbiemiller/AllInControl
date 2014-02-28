package com.cbiemiller.jarvis;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.os.IBinder;
import android.provider.Settings;
import android.content.Context;

public class VolumeManager extends Service{
	String DEP_BLUETOOTH_ON = Settings.Secure.BLUETOOTH_ON; //Deprecated in API 17
	String BLUETOOTH_ON = Settings.Global.BLUETOOTH_ON; 
	static AudioManager am = null;
	int STREAM_RING = AudioManager.STREAM_RING;
	int STREAM_NOTIFICATION = AudioManager.STREAM_NOTIFICATION;
	int STREAM_MEDIA = AudioManager.STREAM_MUSIC;
	int STREAM_ALARM = AudioManager.STREAM_ALARM;
	int STREAM_DTMF = AudioManager.STREAM_DTMF;
	int STREAM_SYSTEM = AudioManager.STREAM_SYSTEM;
	int STREAM_VOICE = AudioManager.STREAM_VOICE_CALL;
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
	
	public static void setVolume(int stream, int volume_level,Context context)
	{
		am = (AudioManager) context.getSystemService(context.AUDIO_SERVICE);
		am.setStreamVolume(stream,volume_level,0);
	}

}
