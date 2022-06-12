package com.jason9075.myopencv;

import android.graphics.Bitmap;

public class NativeLib {

    static {
        System.loadLibrary("myopencv");
    }

    public native String stringFromJNI();

    public native void toGrey(Bitmap bitmapIn, Bitmap bitmapOut);

    public native ImageInfo getInfo(Bitmap bitmap);
}