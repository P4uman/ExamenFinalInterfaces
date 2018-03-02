package p4uman.com.examenpablolira;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar myToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbarCode();
    }


    private void toolbarCode(){
        myToolbar = (Toolbar) findViewById(R.id.tool_bar); // Attaching the layout to the toolbar object
        myToolbar.setElevation(0.0f);
        myToolbar.setTitle("YEP!");
        myToolbar.setBackgroundColor(getColor(R.color.primaryText));
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbarmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.alumni:{
                Toast.makeText(MainActivity.this, "Alumni", Toast.LENGTH_LONG).show();
                return true;
            }
            case R.id.perfil:{
                Toast.makeText(MainActivity.this, "Perfil", Toast.LENGTH_LONG).show();
                return true;
            }
            case R.id.coso1:{
                Toast.makeText(MainActivity.this, "Libro", Toast.LENGTH_LONG).show();
                return true;
            }
            case R.id.coso2:{
                Toast.makeText(MainActivity.this, "Ordenador", Toast.LENGTH_LONG).show();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
