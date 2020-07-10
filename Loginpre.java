package login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import home.Homepre;
import signup.Signuppre;

import com.example.myapp.R;

public class Loginpre extends AppCompatActivity {
    private Button Login;
    private Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpre);

        final Button Login = (Button) findViewById(R.id.loginmainbuttpre);
        Button signup = (Button) findViewById(R.id.logintosignupbutton);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int1 = new Intent(Loginpre.this, Homepre.class);
                startActivity(int1);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(Loginpre.this, Signuppre.class);
                startActivity(intent2);
            }
        });
    }}