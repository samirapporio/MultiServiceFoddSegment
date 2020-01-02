package com.apporioinfolabs.multiservicefoodsegment;

import android.util.Log;

import com.apporioinfolabs.foodsegment.handlers.ProductSegmentActionHandler;

public class MyElementClickHandler implements ProductSegmentActionHandler {
    @Override
    public void onElementClick(String data) {
        Log.d("*********---->  ",""+data);
    }
}
