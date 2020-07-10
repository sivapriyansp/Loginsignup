package signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapp.R;

import home.Homemem;
import login.Loginmem;
import login.Loginpre;

public class Signuppre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppre);

        Button login=(Button)findViewById(R.id.signuptologinbu);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int1= new Intent(Signuppre.this, Loginpre.class);
                startActivity(int1);
            }
        });
    }
}