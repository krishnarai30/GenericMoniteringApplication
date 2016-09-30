package sd_dtu.genericmoniteringapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button loginbtn;
    EditText user;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginbtn=(Button)findViewById(R.id.login);

    }

    public void onclick(View view){
        user=(EditText)findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);
        String username = user.getText().toString();
        String password = pass.getText().toString();
        if(TextUtils.isEmpty(username)||TextUtils.isEmpty(password))
        {
            Toast.makeText(this,"Data Insufficient",Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);
        }
    }
    public void onclicksignupi(View view){
        Intent intentsigni=new Intent(this,SignUpActivity.class);
        startActivity(intentsigni);
    }
    public void onclickforgeti(View view){
        Intent intentsigni=new Intent(this,ForgetPassActivity.class);
        startActivity(intentsigni);
    }
}
