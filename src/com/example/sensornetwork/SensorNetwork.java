package com.example.sensornetwork;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SensorNetwork extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_network);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sensor_network, menu);
        return true;
    }
    
}
