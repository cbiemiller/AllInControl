package com.cbiemiller.jarvis;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class TimeManager extends Service
{

	/** keep track of times when things occur and pass to learning class.
	 *
	 *
	 **/
	@Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
