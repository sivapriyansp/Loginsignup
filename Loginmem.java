package login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapp.R;

import home.Homemem;
import signup.Sigupmem;

public class Loginmem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginmem);

        Button login=(Button)findViewById(R.id.loginbuttonpre);
        Button signup=(Button)findViewById(R.id.loginsignupbutt);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int1= new Intent(Loginmem.this, Homemem.class);
                startActivity(int1);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int2= new Intent(Loginmem.this, Sigupmem.class);
                startActivity(int2);
            }
        });
    }
}