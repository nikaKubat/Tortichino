package hr.algebra.tortichino;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    private TextView tvLogo, tvKuhaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        tvLogo = findViewById(R.id.tvLogo);
        tvKuhaj = findViewById(R.id.tvKuhati);
        Typeface logo = Typeface.createFromAsset(getAssets(), "fonts/LeckerliOne-Regular.otf");
        tvLogo.setTypeface(logo);
        Typeface text = Typeface.createFromAsset(getAssets(), "fonts/CandyRoundBTN-4.ttf");
        tvKuhaj.setTypeface(text);

        Launcher launcher = new Launcher();
        launcher.start();
    }

    private class Launcher extends Thread {
        @Override
        public void run() {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(intent);
            SplashScreenActivity.this.finish();
        }
    }
}
