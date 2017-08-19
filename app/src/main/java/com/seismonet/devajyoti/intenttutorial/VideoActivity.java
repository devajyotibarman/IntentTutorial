package com.seismonet.devajyoti.intenttutorial;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        Uri videouri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.andy);
        VideoView vv = (VideoView) findViewById(R.id.videoView);
        vv.setVideoURI(videouri);
        vv.start();
    }
}
