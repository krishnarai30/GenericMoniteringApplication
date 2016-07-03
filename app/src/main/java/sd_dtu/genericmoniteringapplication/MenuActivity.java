package sd_dtu.genericmoniteringapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button configbtn,connectbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        configbtn=(Button)findViewById(R.id.configurebtn);
        connectbtn=(Button)findViewById(R.id.connectbtn);

    }
    public void onconfigclick(View view){
        Intent intent1=new Intent(this,ConfigureActivity.class);
        startActivity(intent1);
    }
    public void onconnnectclick(View view){
        Intent intent2=new Intent(this,ConnectActivity.class);
        startActivity(intent2);
    }
}
