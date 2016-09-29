package sd_dtu.genericmoniteringapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ConfigureActivity extends AppCompatActivity {
    int number;
    TextView entries;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure);
    }

    public void next(View view)
    {
        entries = (TextView) findViewById(R.id.entries);
        String number_of_entries  =  entries.getText().toString();
        number = Integer.parseInt(number_of_entries);
        nextActivity();
    }

    public void nextActivity()
    {
            Intent intent = new Intent(this,configure_data.class).putExtra("Number",number);
            startActivity(intent);
    }
}
