package com.jason9075.myopencv;

public class ImageInfo {
    private final int width;
    private final int height;

    public ImageInfo(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "ImageInfo{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
