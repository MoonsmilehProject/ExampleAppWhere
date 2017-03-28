package mx.com.moonsmileh.capitalsocial.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import mx.com.moonsmileh.capitalsocial.R;
import mx.com.moonsmileh.capitalsocial.adapter.ItemAdapter;
import mx.com.moonsmileh.capitalsocial.model.Item;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_items);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        List<Item> items = new ArrayList<>();
        // TODO: Get from WS :)

        items.add(new Item("Papa John's","20% en pizzas grandes y extragrandes",R.drawable.pizza));
        items.add(new Item("Idea interior","Obten 3% en tu compra", R.drawable.promo));
        items.add(new Item("Burger King","¡Café americano chico GRATIS!",R.drawable.burger));
        items.add(new Item("Farmacia Benavides","10% en medicamentos genéricos",R.drawable.farmacia));
        items.add(new Item("El tizoncito","2x1 en ¡Ah Dorados!",R.drawable.taco));
        items.add(new Item("Chili's","Ahorra 10% en el total de tu cuenta",R.drawable.chilis));
        items.add(new Item("Zona Fitness","Precio especial en tu anualidad",R.drawable.gym));
        items.add(new Item("Cinépolis","¡GRATIS una entrada cada mes!",R.drawable.cine));
        items.add(new Item("Wingstop","$50 de descuento en la compra de $250",R.drawable.wing));
        items.add(new Item("Italianni's","Ahorra 10% en el total de tu cuenta",R.drawable.pasta));


        recyclerView.setAdapter(new ItemAdapter(items));
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
        getMenuInflater().inflate(R.menu.home, menu);
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

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
