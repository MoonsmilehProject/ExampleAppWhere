package mx.com.moonsmileh.capitalsocial.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import mx.com.moonsmileh.capitalsocial.R;

/**
 * Created by moonsmileh on 27/03/17.
 */

public class SplashActivity extends AppCompatActivity{

    private final static int SPLASH_TIME = 5000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new CountDownTimer(SPLASH_TIME, 1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                finish();
            }
        }.start();

    }
}
