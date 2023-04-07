package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavegationActivity extends AppCompatActivity {

    BottomNavigationView idBottomNavView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_navegation_layout);
        idBottomNavView = findViewById(R.id.idBottomNavView);
        idBottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mNavFav:
                        startActivity(new Intent(getApplicationContext(),
                                MainActivity.class));
                        break;
                    case R.id.mNavMusic:
                        Toast.makeText(getApplicationContext(),
                                "cliquei nas musicas",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mNavPlaces:
                        Toast.makeText(getApplicationContext(),
                                "cliquei no places",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mNavNews:
                        Toast.makeText(getApplicationContext(),
                                "cliquei nas noticias",
                                Toast.LENGTH_SHORT).show();
                        break;

                }

                return true;
            }
        });
    }
}