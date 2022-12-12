package com.example.forkliftdailychecklist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class FirstPage extends AppCompatActivity {
    NavigationView navigation;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        toolbar = (Toolbar) findViewById(R.id.panel);
        setSupportActionBar(toolbar);

        navigation=(NavigationView) findViewById(R.id.navmenu);
        drawerLayout=(DrawerLayout) findViewById(R.id.drawer);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.checklist:
                        Toast.makeText(getApplicationContext(), "DailyChecklist is Open", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(FirstPage.this,DailyChecklist.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.logout:
                        Toast.makeText(getApplicationContext(), "LogOut Successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(FirstPage.this,LoginActivity.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;


                }

                return false;
            }
        });
    }
}