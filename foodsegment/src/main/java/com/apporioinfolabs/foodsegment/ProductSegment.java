package com.apporioinfolabs.foodsegment;

import android.app.Application;

import com.apporioinfolabs.foodsegment.handlers.ProductSegmentActionHandler;
import com.apporioinfolabs.foodsegment.handlers.ProductSegmentScreensLifeCycleHandler;

public class ProductSegment {

    public static ProductSegment.Builder mBuilder = null ;
    private static final String TAG = "TaxiSegment_TaxiSegment";



    public static ProductSegment.Builder startInit(Application application){
        return new ProductSegment.Builder(application) ;
    }

    private static void init(ProductSegment.Builder inBuilder) {
        // here comes the final builder object
        mBuilder = inBuilder ;
    }

    public static class Builder {
        Application mApplication;
        String mBaseUrl ;
        String mFontpath = "";

        ProductSegmentActionHandler mProductSegmentActionHandler;
        ProductSegmentScreensLifeCycleHandler mProductSegmentScreensLifeCycleHandler;


        private Builder() {}

        private Builder(Application application) {
            mApplication = application;
        }

        public Builder setBaseUrl(String baseUrl){
            mBaseUrl = baseUrl ;
            return this ;
        }

        public Builder setFontStyle(String fontpath){
            mFontpath  = fontpath ;
            return this ;
        }






        public Builder setonElementClickHandler(ProductSegmentActionHandler productSegmentActionHandler){
            mProductSegmentActionHandler = productSegmentActionHandler;
            return this;
        }


        public Builder setScreenLifeCyclehandler(ProductSegmentScreensLifeCycleHandler productSegmentScreensLifeCycleHandler ){
            mProductSegmentScreensLifeCycleHandler = mProductSegmentScreensLifeCycleHandler;
            return this ;
        }





        public void init() {
            ProductSegment.init(this);
        }

    }





}