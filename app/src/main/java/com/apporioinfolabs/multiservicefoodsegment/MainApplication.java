package com.apporioinfolabs.multiservicefoodsegment;

import android.app.Application;

import com.apporioinfolabs.foodsegment.ProductSegment;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ProductSegment.startInit(this)
                .setBaseUrl("some base url goes here ")
                .setFontStyle("fonts/GoogleSans-BoldItalic.ttf")
                .setonElementClickHandler(new MyElementClickHandler())
                .setScreenLifeCyclehandler(new MyProductsModuleLifeCycleHandler())
                .init();
    }
}
