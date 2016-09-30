package sd_dtu.genericmoniteringapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConfigureActivity extends AppCompatActivity {
    int number;
    EditText entries;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure);
    }

    public void next(View view)
    {
        entries = (EditText) findViewById(R.id.entries);
        if(TextUtils.isEmpty(entries.getText().toString()))
        {
            Toast.makeText(this,"Empty Text Field!Try Again",Toast.LENGTH_SHORT).show();
        }
        else {
            String number_of_entries = entries.getText().toString();
            number = Integer.parseInt(number_of_entries);
            Intent intent = new Intent(this, configure_data.class).putExtra("Number", number);
            startActivity(intent);
        }
    }

}
