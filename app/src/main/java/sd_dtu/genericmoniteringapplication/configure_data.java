package sd_dtu.genericmoniteringapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class configure_data extends AppCompatActivity {
    int n;
    Button button_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configure_data);
        button_next = (Button) findViewById(R.id.button);
        n = getIntent().getIntExtra("Number",-1);
        if (n==1)
        {
            button_next.setText("FINISH");
        }
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n>1) {
                    TextView name_textview = (TextView) findViewById(R.id.name);
                    ArrayList<items> list_item = new ArrayList<>();
                    list_item.add(new items(name_textview.getText().toString(), "check", 45, 46));
                    Intent intent = new Intent(getBaseContext(), configure_data.class).putExtra("Number",n-1);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getBaseContext(),"Data Saved!",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getBaseContext(),MenuActivity.class);
                    startActivity(intent);
                }
            }
        });


    }




}
