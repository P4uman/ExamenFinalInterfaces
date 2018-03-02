package p4uman.com.examenpablolira;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {

    private TextView txt_yep;
    private Typeface font;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        txt_yep = findViewById(R.id.txt_yep);

        font = Typeface.createFromAsset( getAssets(),"fonts/Nettizen_TRIAL.ttf");
        txt_yep.setTypeface(font);

        (findViewById(R.id.btn_singin)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });



    }
}
