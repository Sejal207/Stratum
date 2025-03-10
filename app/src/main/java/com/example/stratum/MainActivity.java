package com.example.stratum;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private LinearLayout sem1, sem2, sem3, sem4, sem5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sem1 = findViewById(R.id.sem_1);
        sem2 = findViewById(R.id.sem_2);
        sem3 = findViewById(R.id.sem_3);
        sem4 = findViewById(R.id.sem_4);
        sem5 = findViewById(R.id.sem_5);

        sem1.setOnClickListener(v -> showToast("Sem I Selected"));
        sem2.setOnClickListener(v -> showToast("Sem II Selected"));
        sem3.setOnClickListener(v -> showToast("Sem III Selected"));
        sem4.setOnClickListener(v -> showToast("Sem IV Selected"));
        sem5.setOnClickListener(v -> showToast("Sem V Selected"));
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
