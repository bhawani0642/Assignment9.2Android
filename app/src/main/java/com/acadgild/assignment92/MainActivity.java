package com.acadgild.assignment92;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     //onCreateOptionsMenu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }
    //In onOptionsItemSelected adding switch case to show which item is selected as a Toast
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         super.onOptionsItemSelected(item);
switch (item.getItemId()){
    case R.id.computer:
        Toast.makeText(getApplicationContext(),"Computer is selected",Toast.LENGTH_LONG).show();
        break;
    case  R.id.gamepad:
        Toast.makeText(getApplicationContext(),"Gamepad is selected",Toast.LENGTH_LONG).show();
        break;
    case R.id.camera:
        Toast.makeText(getApplicationContext(),"Camera is selected",Toast.LENGTH_LONG).show();
        break;
    case R.id.video:
        Toast.makeText(getApplicationContext(),"Video is selected",Toast.LENGTH_LONG).show();
        break;
    case  R.id.email:
        Toast.makeText(getApplicationContext(),"Email is selected",Toast.LENGTH_LONG).show();
        break;
}


        return true;
    }
}
