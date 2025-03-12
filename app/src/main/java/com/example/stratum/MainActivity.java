package com.example.stratum;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private TextView welcomeMessage, assignmentCount, updateText;
    private Button viewTimetable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeMessage = findViewById(R.id.welcomeMessage);
        assignmentCount = findViewById(R.id.assignmentCount);
        updateText = findViewById(R.id.updateText);
        viewTimetable = findViewById(R.id.viewTimetable);
        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigation);

        // Click listener for timetable
        viewTimetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Opening Timetable...", Toast.LENGTH_SHORT).show();
            }
        });

        // Bottom Navigation Handling
        bottomNavigation.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    Toast.makeText(this, "Home Selected", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.nav_subjects:
                    Toast.makeText(this, "Subjects Selected", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.nav_board:
                    Toast.makeText(this, "Board Selected", Toast.LENGTH_SHORT).show();
                    return true;
            }
            return false;
        });
    }
}
