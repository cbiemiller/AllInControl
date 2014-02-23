package com.cbiemiller.jarvis;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by Casey on 2/23/14.
 */
public class NetworkManager extends Service {

    /**
     * Implement a Network control interface.
     * Possibly include WOL feature.
     * Wifi controls, Bluetooth controls, NFC Controls, etc... should be handled here
     */
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
