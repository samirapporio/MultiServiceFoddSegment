package com.apporioinfolabs.foodsegment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.apporioinfolabs.foodsegment.utils.ProductsSegmentLogs;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class BaseProductSegmentActivity extends FragmentActivity {

    @Override
    protected void onStart() {
        super.onStart();
        dispatchLifeCycle("onStart");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath( ProductSegment.mBuilder.mFontpath.equals("")? "fonts/GoogleSans-Regular.ttf" : ProductSegment.mBuilder.mFontpath )
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        dispatchLifeCycle("onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        dispatchLifeCycle("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        dispatchLifeCycle("onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        dispatchLifeCycle("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        dispatchLifeCycle("onDestroy");
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


    private void dispatchLifeCycle( String lifeCycle){
        if(ProductSegment.mBuilder.mProductSegmentScreensLifeCycleHandler == null){
            ProductsSegmentLogs.e(""+getClass().getSimpleName(),"Found No Product Segment Screen LifeCycle handler");
        }else{
            ProductSegment.mBuilder.mProductSegmentScreensLifeCycleHandler.onScreenLifeCucler(""+getClass().getSimpleName(),""+lifeCycle);
        }
    }
}
