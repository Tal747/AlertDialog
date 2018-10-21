package com.example.tal.alertdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout LL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        if (id==R.id.MenuCredits)
            startActivity(t);
        return super.onOptionsItemSelected(item);
    }

    public void OC_btn1(View view) {
        AlertDialog.Builder adb;
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Text only");
        adb.setMessage("Yo listen up, here's the story");
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void OC_btn2(View view) {
        AlertDialog.Builder adb;
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Text only");
        adb.setMessage("About a little guy that lives in a blue world");
        adb.setIcon(R.drawable.blue);
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void OC_btn3(View view) {
        AlertDialog.Builder adb;
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Text only");
        adb.setMessage("And all day and all night and everything he sees is just blue");
        adb.setIcon(R.drawable.blue);
        adb.setNeutralButton("OK", null);
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void OC_btn4(View view) {
        AlertDialog.Builder adb;
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Text only");
        adb.setMessage("And all day and all night and everything he sees is just blue");
        adb.setIcon(R.drawable.blue);
        adb.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        adb.setNeutralButton("Cancel", null);
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void OC_btn5(View view) {
        AlertDialog.Builder adb;
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Text only");
        adb.setMessage("And all day and all night and everything he sees is just blue");
        adb.setIcon(R.drawable.blue);
        adb.setPositiveButton("Random", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Random (BG LL)
            }
        });
        adb.setNegativeButton("White", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        adb.setNeutralButton("OK", null);
        AlertDialog ad = adb.create();
        ad.show();
    }
}
