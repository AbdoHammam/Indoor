package com.example.abdo.locatemegp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.indooratlas.android.sdk.IALocationManager;
import com.indooratlas.android.sdk.resources.IAResourceManager;

public class ResourceManagerActivity extends AppCompatActivity {

    private IALocationManager mLocationManager;
    private IAResourceManager mResourceManager;
    private ImageView mFloorPlanImage;

    // ...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor_plan_manager);
        mFloorPlanImage = (ImageView) findViewById(R.id.image);
        // ...
        // Create instance of IAFloorPlanManager class
        //IAFloorPlanManager mFloorPlanManager;
        //mFloorPlanManager = IAResourceManager.create(this);
    }
}
