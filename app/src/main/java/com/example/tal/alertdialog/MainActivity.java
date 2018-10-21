package com.example.tal.alertdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    LinearLayout LL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LL = findViewById(R.id.LL);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent t = new Intent(this, CreditsActivity.class);
        if (id == R.id.MenuCredits)
            startActivity(t);
        return super.onOptionsItemSelected(item);
    }

    public void OC_btn1(View view) {
        AlertDialog.Builder adb;
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Alert #1");
        adb.setMessage("This is a text-only alert.");
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void OC_btn2(View view) {
        AlertDialog.Builder adb;
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Alert #2");
        adb.setMessage("This is a text and icon alert.");
        adb.setIcon(R.drawable.checked);
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void OC_btn3(View view) {
        AlertDialog.Builder adb;
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Alert #3");
        adb.setMessage("This is a text, icon and button alert.");
        adb.setIcon(R.drawable.checked);
        adb.setPositiveButton("OK", null);
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void OC_btn4(View view) {
        AlertDialog.Builder adb;
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Background color");
        adb.setMessage("Do you want to change to a random background color?");
        adb.setIcon(R.drawable.checked);
        adb.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Random rnd = new Random();
                LL.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            }
        });
        adb.setNeutralButton("Cancel", null);
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void OC_btn5(View view) {
        AlertDialog.Builder adb;
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Background color");
        adb.setMessage("Please select background color.");
        adb.setIcon(R.drawable.checked);
        adb.setPositiveButton("Random", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Random rnd = new Random();
                LL.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            }
        });
        adb.setNegativeButton("White", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                LL.setBackgroundColor(Color.WHITE);
            }
        });
        adb.setNeutralButton("Cancel", null);
        AlertDialog ad = adb.create();
        ad.show();
    }
}
