package image.color.git.lab3_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private View view ;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.container);
        view.setBackgroundColor(00000);
    }

    public void chooseColor(MenuItem item) {
//        if ( item.getTitle())
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Log.d("what", "item id: " + item.getItemId());
        if (item.getItemId() == R.id.color_red) {
            text = findViewById(R.id.text);
            text.setText("Red");

            view = findViewById(R.id.container);
            view.setBackgroundColor(Color.RED);
            Log.d("what", "did it even get here?");
        }
        if (item.getItemId() == R.id.color_green) {
            text = findViewById(R.id.text);
            text.setText("Green");

            view = findViewById(R.id.container);
            view.setBackgroundColor(Color.GREEN);
        }
        if (item.getItemId() == R.id.color_blue) {
            text = findViewById(R.id.text);
            text.setText("Blue");

            view = findViewById(R.id.container);
            view.setBackgroundColor(Color.BLUE);
        }
        if (item.getItemId() == R.id.color_pink) {
            text = findViewById(R.id.text);
            text.setText("Pink");

            view = findViewById(R.id.container);
            view.setBackgroundColor(0xFFFFC0CB);
        }
        return true;
    }
}
