package sd_dtu.genericmoniteringapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    Button loginbtn;
    EditText user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginbtn=(Button)findViewById(R.id.login);
        user=(EditText)findViewById(R.id.editText);
    }

    public void onclick(View view){
        Intent intent=new Intent(this,MenuActivity.class);
        startActivity(intent);
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
