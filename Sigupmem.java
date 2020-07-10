package signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapp.R;

import login.Loginmem;
import login.Loginpre;

public class Sigupmem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigupmem);
        Button login1=(Button)findViewById(R.id.signuptologinbutton);

        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int1= new Intent(Sigupmem.this, Loginmem.class);
                startActivity(int1);
            }
        });
    }
}