package com.seismonet.devajyoti.intenttutorial;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.provider.MediaStore;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button dial_number;
    Button locate_me;
    Button click_picture;
    Button open_link;
    Button run_video;
    Button btn6;
    Button btn7;
    static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dial_number = (Button) findViewById(R.id.button1);
        dial_number.setOnClickListener(this);

        locate_me = (Button) findViewById(R.id.button2);
        locate_me.setOnClickListener(this);

        click_picture = (Button) findViewById(R.id.button3);
        click_picture.setOnClickListener(this);

        open_link = (Button) findViewById(R.id.button4);
        open_link.setOnClickListener(this);

        run_video = (Button) findViewById(R.id.button5);
        run_video.setOnClickListener(this);

        btn6 = (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(this);

        btn7 = (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast toast = Toast.makeText(getApplicationContext(), "Clicked A Button", Toast.LENGTH_SHORT);
        toast.show();
        Intent intent;

        switch (v.getId()) {
            case R.id.button1:
                toast.setText("Clicked \"Dial Number\"");
                toast.show();
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "+919845400663"));
                startActivity(intent);
                break;
            case R.id.button2:
                toast.setText("Clicked \"Locate Me\"");
                toast.show();
                intent = new Intent((Intent.ACTION_VIEW), Uri.parse("geo:" + "30.058924,-83.941756,972m/data=!3m1!1e3"));
                startActivity(intent);
                break;
            case R.id.button3:
                toast.setText("Clicked \"Click Picture\"");
                toast.show();
                intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
                break;
            case R.id.button4:
                toast.setText("Clicked \"Open Link\"");
                toast.show();
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/"));
                startActivity(intent);
                break;
            case R.id.button5:
                toast.setText("Clicked \"Run Video\"");
                toast.show();
                intent = new Intent(this, VideoActivity.class);
                startActivity(intent);
                break;
            default:
                toast.setText("Default Action");
                toast.show();
        }

    }
}
