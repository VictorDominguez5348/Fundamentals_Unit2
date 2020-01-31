package com.example.fundamentals_unit2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    public String mOrder;
    public static final String EXTRA_MESSAGE = "com.example.android.droidcafe.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, OrderActivity.class);
                intent.putExtra(EXTRA_MESSAGE, mOrder);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayToast (String m)
    {
        Toast.makeText (getApplicationContext(), m, Toast.LENGTH_SHORT).show ();
    }

    public void showDonut (View v)
    {
        mOrder = getString (R.string.donut_order_message);
        displayToast (getString(R.string.donut_order_message));
    }

    public void showIceCream (View v)
    {
        mOrder = getString(R.string.ice_cream_order_message);
        displayToast (getString(R.string.ice_cream_order_message));
    }

    public void showYogurt (View v)
    {
        mOrder = getString (R.string.yogurt_order_message);
        displayToast (getString (R.string.yogurt_order_message));
    }

} // END OF PROJECT
