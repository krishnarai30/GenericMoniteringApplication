package sd_dtu.genericmoniteringapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class configure_data extends AppCompatActivity {
    int n;
    Button button_next;
    EditText name;
    EditText upper;
    EditText lower;
    String Name;
    String[] list = {"Int","Float","Double","Signed"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configure_data);
        button_next = (Button) findViewById(R.id.button);
        name = (EditText)findViewById(R.id.name);
        upper = (EditText)findViewById(R.id.upper_limit);
        lower = (EditText)findViewById(R.id.lower_limit);
        final Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.spinner_layout,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        n = getIntent().getIntExtra("Number",-1);
        if (n==1)
        {
            button_next.setText("FINISH");
        }
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n>1) {


                    if(TextUtils.isEmpty(name.getText().toString())||TextUtils.isEmpty(upper.getText().toString())||TextUtils.isEmpty(lower.getText().toString()))
                    {
                        Toast.makeText(getBaseContext(),"Data Insufficient",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        int low = Integer.parseInt(lower.getText().toString());
                        int up = Integer.parseInt(upper.getText().toString());
                        if(low>up)
                        {
                            Toast.makeText(getBaseContext(),"Lower limit greater than upper limit",Toast.LENGTH_SHORT).show();
                        }
                        else {

                            Intent intent = new Intent(getBaseContext(), configure_data.class).putExtra("Number", n - 1);
                            startActivity(intent);
                        }
                    }
                }
                else
                {
                    if(TextUtils.isEmpty(name.getText().toString())||TextUtils.isEmpty(upper.getText().toString())||TextUtils.isEmpty(lower.getText().toString()))
                    {
                        Toast.makeText(getBaseContext(),"Data Insufficient",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(getBaseContext(), "Data Saved!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getBaseContext(), MenuActivity.class);
                        startActivity(intent);
                    }
                }
            }
        });


    }




}
