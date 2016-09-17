package sd_dtu.genericmoniteringapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ConfigureActivity extends AppCompatActivity {
    String number_of_entries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure);
    }

    public void next(View view)
    {
        TextView entries = (TextView) findViewById(R.id.entries);
        number_of_entries  =  entries.getText().toString();

    }
}
