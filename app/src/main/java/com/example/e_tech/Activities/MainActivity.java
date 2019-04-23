package com.example.e_tech.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import com.example.e_tech.Fragments.AboutUsFragment;
import com.example.e_tech.Fragments.AccesoriesFragment;
import com.example.e_tech.Fragments.EditProfileFragment;
import com.example.e_tech.Fragments.FlashOffersFragment;
import com.example.e_tech.Fragments.LaptopsFragment;
import com.example.e_tech.Fragments.MobilesFragment;
import com.example.e_tech.Fragments.TabletsFragment;
import com.example.e_tech.Fragments.homeFragment;
import com.example.e_tech.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

public static int opened = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //opened(opened);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if(opened==0) {
            navigationView.setCheckedItem(R.id.nav_home);
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.app_bar_content_main, new homeFragment())
                    .commit();

        }else if(opened==1){
            navigationView.setCheckedItem(R.id.nav_acc);
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.app_bar_content_main, new AccesoriesFragment());
            ft.commit();
        }

        else if(opened==2){
            navigationView.setCheckedItem(R.id.nav_mobiles);
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.app_bar_content_main, new MobilesFragment());
            ft.commit();
        }

        else if(opened==3){
            navigationView.setCheckedItem(R.id.nav_tablets);
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.app_bar_content_main, new TabletsFragment());
            ft.commit();
        }

        else if(opened==4){
            navigationView.setCheckedItem(R.id.nav_laptops);
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.app_bar_content_main, new LaptopsFragment());
            ft.commit();
        }

        else if(opened==5){
            navigationView.setCheckedItem(R.id.nav_deals);
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.app_bar_content_main, new FlashOffersFragment());
            ft.commit();
        }




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
        Fragment fragment = new Fragment();

        if(id==R.id.nav_home){
            fragment = new homeFragment();

        } else if (id == R.id.nav_deals) {

            fragment = new FlashOffersFragment();

        } else if (id == R.id.nav_mobiles) {

            fragment= new MobilesFragment();

        } else if (id == R.id.nav_tablets) {

            fragment=new TabletsFragment();

        } else if (id == R.id.nav_laptops) {

            fragment = new LaptopsFragment();

        } else if (id == R.id.nav_acc) {

            fragment = new AccesoriesFragment();

        } else if (id == R.id.nav_share) {


        } else if (id == R.id.nav_send) {


        } else if (id == R.id.nav_edit) {

            fragment = new EditProfileFragment();

        } else if (id == R.id.nav_about) {

            fragment = new AboutUsFragment();


        }

        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.app_bar_content_main, fragment);
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    void opened (int i){
        // Handle navigation view item clicks here.
        Fragment fragment = new Fragment();

        if(i==0){
            fragment = new homeFragment();

        } else if (i==1) {

            fragment = new AccesoriesFragment();

        } else if (i==2){

            fragment=new MobilesFragment();

        } else if (i==3){

            fragment=new TabletsFragment();

        } else if (i==4){

            fragment= new LaptopsFragment();

        }else if (i==5){

            fragment= new FlashOffersFragment();
        }



        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.app_bar_content_main, fragment);
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }



}
