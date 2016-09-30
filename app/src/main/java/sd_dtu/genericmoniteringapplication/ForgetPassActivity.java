package sd_dtu.genericmoniteringapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ForgetPassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);
    }
    public void onclickrecover(View view){
        EditText email = (EditText)findViewById(R.id.forget_email);
        if(TextUtils.isEmpty(email.getText().toString()))
        {
            Toast.makeText(this,"Data Insufficient!",Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intentsigni = new Intent(this, LoginActivity.class);
            startActivity(intentsigni);
        }
    }
}
