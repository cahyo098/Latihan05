package id.ac.poliban.mi.cahyo.latihan05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btAjax = findViewById(R.id.btAjax);
        Button btFiorentina = findViewById(R.id.btFiorentina);
        Button btRealMadrid = findViewById(R.id.btReal);

        btAjax.setOnClickListener(v -> Toast.makeText(this, "Hai Ajax", Toast.LENGTH_SHORT).show());
        btFiorentina.setOnClickListener(v -> Toast.makeText(this, "Hai Fiorentina", Toast.LENGTH_SHORT).show());
        btRealMadrid.setOnClickListener(v -> Toast.makeText(this, "Hai RealMadrid", Toast.LENGTH_SHORT).show());
    }
}
