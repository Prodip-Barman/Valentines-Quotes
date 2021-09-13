package com.example.valentinesquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TaskStackBuilder;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashActivity extends AppCompatActivity {

    ImageView imageView;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        preferences = this.getSharedPreferences("splash", MODE_PRIVATE);
        editor = preferences.edit();

        imageView = findViewById(R.id.splash_img);
        Glide.with(this).asGif().load(R.raw.splash_screen).into(imageView);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {

                if (preferences.getBoolean("isMain", false)){
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    editor.putBoolean("isMain", true);
                    editor.apply();

                    TaskStackBuilder.create(SplashActivity.this)
                            .addNextIntentWithParentStack(new Intent(SplashActivity.this, MainActivity.class))
                            .addNextIntent(new Intent(SplashActivity.this, MainActivity.class))
                            .startActivities();
                }

            }
        }, 4000);
    }
}