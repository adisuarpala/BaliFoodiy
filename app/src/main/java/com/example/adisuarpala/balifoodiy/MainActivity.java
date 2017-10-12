package com.example.adisuarpala.balifoodiy;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import me.anshulagarwal.expandablemenuoption.ExpandableMenuView;

public class MainActivity extends AppCompatActivity {

    ExpandableMenuView expandableMenuView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        expandableMenuView = (ExpandableMenuView)findViewById(R.id.expandable_menu);
        expandableMenuView.setOnMenuListener(new ExpandableMenuView.MenuListener() {

            @Override
            public void rightPressed() {
            }

            @Override
            public void leftPressed() {
            }

            @Override
            public void topPressed() {
                Intent intent = new Intent(
                        MainActivity.this, BhsIndoActivity.class);
                startActivity(intent);


                Toast.makeText(MainActivity.this, "Bahasa Indonesia", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void bottomPressed() {

                Intent intent = new Intent(
                        MainActivity.this, BhsEngActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "English Selected", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
