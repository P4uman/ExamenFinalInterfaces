package p4uman.com.examenpablolira;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Point;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.TextView;

import com.daimajia.easing.Glider;
import com.daimajia.easing.Skill;

public class SplashScreen extends AppCompatActivity {

    private int screen_height_;
    private long duration = 4000;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Display display = this.getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        screen_height_ = size.y;

        txt = findViewById(R.id.txt);
        animacion();
    }

    private void animacion(){

        long y_translation = (screen_height_ * -450) / 800;
        AnimatorSet set = new AnimatorSet();
        set.playTogether(
                Glider.glide(Skill.CubicEaseOut, 2000,
                        ObjectAnimator.ofFloat(txt, "translationY",0, y_translation))

        );

        set.setDuration(duration);
        set.start();

        new CountDownTimer(duration, duration){
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(SplashScreen.this, LoginScreen.class);
                startActivity(intent);
                finish();
            }
        }.start();
    }
}
