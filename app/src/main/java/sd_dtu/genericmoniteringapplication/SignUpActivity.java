package sd_dtu.genericmoniteringapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    EditText username;
    EditText pass;
    EditText cpass;
    EditText email;
    EditText mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void onclicksignupf(View view){
        username = (EditText)findViewById(R.id.usernameet);
        pass = (EditText)findViewById(R.id.pass1et);
        cpass = (EditText)findViewById(R.id.pass2et);
        email = (EditText)findViewById(R.id.emailet);
        mobile = (EditText)findViewById(R.id.mobileet);
        if(TextUtils.isEmpty(username.getText().toString())||TextUtils.isEmpty(pass.getText().toString())||TextUtils.isEmpty(cpass.getText().toString())||TextUtils.isEmpty(email.getText().toString())||TextUtils.isEmpty(mobile.getText().toString()))
        {
            Toast.makeText(this,"Data Insufficient!",Toast.LENGTH_SHORT).show();
        }
        else {

            Toast.makeText(this, "Account Created! Sign In", Toast.LENGTH_SHORT).show();
            Intent intentsign = new Intent(this, LoginActivity.class);
            startActivity(intentsign);
        }
    }
    public void login(View view)
    {
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
