package com.videoview.library.component.player.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/**
 * Created by Ted on 2015/8/6.
 * WKVideoView
 */
public class MyVideoView extends VideoView {

    private int videoWidth;
    private int videoHeight;

    public MyVideoView(Context context) {
        super(context);
    }

    public MyVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyVideoView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @SuppressWarnings("unused")
    public void setVideoWidth(int videoWidth) {
        this.videoWidth = videoWidth;
    }

    @SuppressWarnings("unused")
    public void setVideoHeight(int videoHeight) {
        this.videoHeight = videoHeight;
    }

    @SuppressWarnings("unused")
    public int getVideoWidth() {
        return videoWidth;
    }

    @SuppressWarnings("unused")
    public int getVideoHeight() {
        return videoHeight;
    }
}
