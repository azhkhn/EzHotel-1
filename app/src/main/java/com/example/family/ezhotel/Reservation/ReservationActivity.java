package com.example.family.ezhotel.Reservation;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.family.ezhotel.CheckIO.CheckIOActivity;
import com.example.family.ezhotel.HomeActivity;
import com.example.family.ezhotel.LoginActivity;
import com.example.family.ezhotel.NoticeBoard.NoticeBoardActivity;
import com.example.family.ezhotel.Payment.PaymentActivity;
import com.example.family.ezhotel.R;

public class ReservationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.default_activity, menu);
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

    public void addReservation(View v){
        Intent intent = new Intent(this, AddReservationActivity.class);
        startActivity(intent);
    }
    public void editReservation(View v){
        Intent intent = new Intent(this, EditReservationActivity.class);
        startActivity(intent);
    }
    public void reservationRecord(View v){
        Intent intent = new Intent(this, ReservationRecordActivity.class);
        startActivity(intent);
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override


    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent intent;

        if (id == R.id.nav_home) {
            intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }else if (id == R.id.nav_reservation) {

        } else if (id == R.id.nav_checkIn) {
            intent = new Intent(this, CheckIOActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_checkOut) {
            intent = new Intent(this, CheckIOActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_payment) {
            intent = new Intent(this, PaymentActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_noticeboard) {
            intent = new Intent(this, NoticeBoardActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_logout) {
            intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
