package sd_dtu.genericmoniteringapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void onclicksignupf(View view){
        Toast.makeText(this,"Account Created! Sign In",Toast.LENGTH_SHORT).show();
        Intent intentsign=new Intent(this,LoginActivity.class);
        startActivity(intentsign);
    }
    public void login(View view)
    {
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
