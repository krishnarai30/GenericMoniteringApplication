package sd_dtu.genericmoniteringapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConnectActivity extends AppCompatActivity {

    Button startbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connect);
        startbtn=(Button)findViewById(R.id.start);

    }

    public void onclickstart(View view){
        Intent intent=new Intent(this,FinalActivity.class);
        startActivity(intent);
    }
}
