package com.example.valentinesquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MaterialCardView card1, card2, card3, card4, card5, card6, card7, card8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);
        card5 = findViewById(R.id.card5);
        card6 = findViewById(R.id.card6);
        card7 = findViewById(R.id.card7);
        card8 = findViewById(R.id.card8);


        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        AlertDialog builder = new AlertDialog.Builder(this)
                .setMessage("আপনি কি অ্যাপটি বন্ধ করতে চান?")
                .setNegativeButton("না", null)
                .setPositiveButton("হ্যা", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                    }
                }).show();
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this, ShayariActivity.class);
        switch (v.getId()){
            case R.id.card1:
                intent.putExtra("cat", 1);
                startActivity(intent);
                break;
            case R.id.card2:
                intent.putExtra("cat", 2);
                startActivity(intent);
                break;
            case R.id.card3:
                intent.putExtra("cat", 3);
                startActivity(intent);
                break;
            case R.id.card4:
                intent.putExtra("cat", 4);
                startActivity(intent);
                break;
            case R.id.card5:
                intent.putExtra("cat", 5);
                startActivity(intent);
                break;
            case R.id.card6:
                intent.putExtra("cat", 6);
                startActivity(intent);
                break;
            case R.id.card7:
                intent.putExtra("cat", 7);
                startActivity(intent);
                break;
            case R.id.card8:
                intent.putExtra("cat", 8);
                startActivity(intent);
                break;
        }
    }
}