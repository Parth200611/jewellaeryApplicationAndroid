package com.bansal.JewellaryApplication;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class splashactivity extends AppCompatActivity {
    ImageView ivAppLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashactivity);
        getWindow().setNavigationBarColor(ContextCompat.getColor(splashactivity.this,R.color.white));
        getWindow().setStatusBarColor(ContextCompat.getColor(splashactivity.this,R.color.white));

        ivAppLogo = findViewById(R.id.ivSplashScreenAppLogo);


        animateSplashScreen();


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splashactivity.this,LoginActivity.class);
                startActivity(i);
            }
        },6000);




    }
    private void animateSplashScreen() {
        // Logo Zoom-in animation
        ObjectAnimator logoAnimator = ObjectAnimator.ofFloat(ivAppLogo, "scaleX", 0f, 1f);
        logoAnimator.setDuration(1000);
        logoAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        logoAnimator.start();

        ObjectAnimator logoAnimatorY = ObjectAnimator.ofFloat(ivAppLogo, "scaleY", 0f, 1f);
        logoAnimatorY.setDuration(1000);
        logoAnimatorY.setInterpolator(new AccelerateDecelerateInterpolator());
        logoAnimatorY.start();

        // App Name Fade-in animation

    }
}