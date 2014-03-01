package com.cbiemiller.jarvis;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LocationManager extends Service
{
	
	/** keep track of the users location and pass to a learning class.
	*
	*
	**/
	@Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
