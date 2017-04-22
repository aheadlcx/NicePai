package me.aheadlcx.nicepai.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.videoview.lib.component.player.model.Video;
import com.videoview.lib.component.player.model.VideoUrl;
import com.videoview.lib.component.player.view.SuperVideoPlayer;

import java.util.ArrayList;

import me.aheadlcx.nicepai.R;
import me.aheadlcx.nicepai.base.BaseActivity;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/3/2 下午4:10
 */
public class CateDetailAct extends BaseActivity {
    private static final String TAG = "CateDetailAct";

    private SuperVideoPlayer videoPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_cate_detail);
        this.videoPlayer = (SuperVideoPlayer) findViewById(R.id.videoPlayer);
        String url = getIntent().getStringExtra("videoUrl");

        VideoUrl  videoUrl1 = new VideoUrl();
        videoUrl1.setFormatName("标准");
        videoUrl1.setFormatUrl(url);
        videoUrl1.setIsOnlineVideo(true);

        Video video = new Video();
        video.setPlayUrl(videoUrl1);

        ArrayList<VideoUrl> videoUrls = new ArrayList<>();
        video.setVideoUrl(videoUrls);

        ArrayList<Video> videos = new ArrayList<>();
        videos.add(video);
        videoPlayer.loadMultipleVideo(videos);
        videoPlayer.setVideoPlayCallback(new SuperVideoPlayer.VideoPlayCallbackImpl() {
            @Override
            public void onCloseVideo() {
                Log.i(TAG, "onCloseVideo: ");
            }

            @Override
            public void onSwitchPageType() {
                Log.i(TAG, "onSwitchPageType: ");
            }

            @Override
            public void onPlayFinish() {
                CateDetailAct.this.finish();
            }
        });
    }
}
