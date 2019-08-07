package com.example.soccerapp.activity;

import android.app.ProgressDialog;
import android.os.Bundle;

import com.example.soccerapp.R;
import com.example.soccerapp.adapter.TopscorersAdapter;
import com.example.soccerapp.fragment.FixturesFragment;
import com.example.soccerapp.fragment.HomeFragment;
import com.example.soccerapp.fragment.SliderFragment;
import com.example.soccerapp.fragment.StandingsFragment;
import com.example.soccerapp.fragment.ThirdFragment;
import com.example.soccerapp.fragment.TopscorersFragment;
import com.example.soccerapp.fragment.WeatherFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.content)
    FrameLayout content;
    //
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_standings:
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, StandingsFragment.newInstance(null,null))
                            .commit();
                    return true;
                case R.id.navigation_fixtures:
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, FixturesFragment.newInstance(null,null))
                            .commit();
                    return true;
                case R.id.navigation_topscorers:
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, TopscorersFragment.newInstance(null,null))
                            .commit();
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //BottomNavigation..
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        mOnNavigationItemSelectedListener.onNavigationItemSelected(navView.getMenu().getItem(0));

        //NavigationDrawer..

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setLogo(R.drawable.superliga_logo);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view_left);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home_layout) {
            // Handle the camera action
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.content, HomeFragment.newInstance("news","1"))
                    .commit();
        } else if (id == R.id.nav_weather_layout) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.content, WeatherFragment.newInstance("Weather","2"))
                    .commit();

        } else if (id == R.id.nav_third_layout) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.content, new ThirdFragment())
                    .commit();
        } else if (id == R.id.nav_share) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.content, SliderFragment.newInstance("news","1"))
                    .commit();
        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

}
